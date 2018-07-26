package com.jdddata.dockermgr.common.job;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.adapter.docker.DockerClient;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpResponse;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.list.ContainerListDto;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.dao.modle.ContainerInfo;
import com.jdddata.dockermgr.dao.modle.ProjectDeployInfo;
import com.jdddata.dockermgr.service.ProjectMgrService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private ProjectMgrService projectMgrService;

    @Scheduled(cron = "0 0/5 * * * *")
    public void updateContainerInfo() {
        /*ip+containerName*/
        Map<String, ContainerListDto> containerListDtoMap = new HashMap<>(16);
        List<ProjectDeployInfo> deployInfos = projectDeployInfoMapper.queryProjectDeployInfo(new ProjectDeployInfo());
        for (ProjectDeployInfo item : deployInfos) {
            ContainerListDto dto = containerListDtoMap.get(item.getHostIp() + item.getContainerName());
            if (Objects.isNull(dto)) {
                String ip = item.getHostIp();
                HttpResponse httpResponse = DockerClient.listContainers(ip);
                if (httpResponse != null && httpResponse.getStatusCode() == 200) {
                    String body = httpResponse.getBody();
                    List<ContainerListDto> obj = JSON.parseArray(body, ContainerListDto.class);
                    for (ContainerListDto containerListDto : obj) {
                        String containerName = containerListDto.getNames().get(0).substring(1);
                        if (Objects.equals(item.getContainerName(), containerName)) {
                            ContainerInfo containerInfo = containerListDto.convert();
                            containerInfo.setDeployId(item.getId());
                            projectMgrService.saveOrUpdateContainerInfo(containerInfo);
                        } else {
                            containerListDtoMap.put(ip + containerName, containerListDto);
                        }
                    }
                } else {
                    log.error("=====>>>>>获取dockerApi信息失败");
                }
            } else {
                ContainerInfo containerInfo = dto.convert();
                containerInfo.setDeployId(item.getId());
                projectMgrService.saveOrUpdateContainerInfo(containerInfo);
            }

        }
        log.info("=====>>>>>同步docker message");
    }
}
