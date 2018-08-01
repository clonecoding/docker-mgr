package com.jdddata.dockermgr.job;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.adapter.docker.DockerClient;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpResponse;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.list.ContainerListDto;
import com.jdddata.dockermgr.dao.cmapper.ContainerInfoCMapper;
import com.jdddata.dockermgr.dao.cmapper.ServerMgrCMapper;
import com.jdddata.dockermgr.dao.entity.ContainerInfo;
import com.jdddata.dockermgr.service.ContainerService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 17:55
 * @modified By:
 */
@Component
@Log4j
public class ContainerInfoJob {

    @Autowired
    private ContainerInfoCMapper containerInfoCMapper;


    @Autowired
    ContainerService containerService;

    @Autowired
    private ServerMgrCMapper serverMgrCMapper;

    @Scheduled(cron = "0 0/5 * * * *")
    public void updateContainerInfo() {
        /*ip+containerName*/
        List<String> ips = serverMgrCMapper.getIps();
        Map<String, ContainerListDto> containerListDtoMap = new HashMap<>(16);
        List<ContainerInfo> containerInfos = containerInfoCMapper.listAll();
        LinkedHashMap<String,ContainerInfo> map = new LinkedHashMap(16);
        if (!CollectionUtils.isEmpty(containerInfos)) {
            containerInfos.forEach(item -> {
                map.put(item.getHostIp() + item.getContainerName(), item);
            });
        }
        for (String ip : ips) {
            HttpResponse httpResponse = DockerClient.listContainers(ip);
            if (httpResponse != null && httpResponse.getStatusCode() == 200) {
                String body = httpResponse.getBody();
                List<ContainerListDto> obj = JSON.parseArray(body, ContainerListDto.class);
                for (ContainerListDto containerListDto : obj) {
                    String containerName = containerListDto.getNames().get(0).substring(1);
                    if (Objects.nonNull(map.get(ip + containerName))) {
                        ContainerInfo containerInfo = containerListDto.convert();
                        containerInfo.setHostIp(ip);
                        containerInfo.setId((map.get(ip + containerName).getId()));
                        containerService.saveOrUpdateContainerInfo(containerInfo);
                        //移除
                        map.remove(ip + containerName);
                    } else {
                        ContainerInfo containerInfo = containerListDto.convert();
                        containerInfo.setHostIp(ip);
                        containerService.saveOrUpdateContainerInfo(containerInfo);
                    }
                }
            } else {
                log.error("=====>>>>>获取dockerApi信息失败");
            }
        }
        if(map.size() >0){
            map.forEach((key,value) -> {
                containerInfoCMapper.updateDelete(value.getId(),1);
            });
        }
        log.info("=====>>>>>同步docker message");
    }
}
