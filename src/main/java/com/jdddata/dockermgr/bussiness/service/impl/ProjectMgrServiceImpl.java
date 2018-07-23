package com.jdddata.dockermgr.bussiness.service.impl;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.bussiness.mapper.ContainerInfoMapper;
import com.jdddata.dockermgr.bussiness.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.bussiness.mapper.ProjectMgrMapper;
import com.jdddata.dockermgr.bussiness.modle.ContainerInfo;
import com.jdddata.dockermgr.bussiness.modle.ProjectDeployInfo;
import com.jdddata.dockermgr.bussiness.modle.ProjectMgr;
import com.jdddata.dockermgr.bussiness.service.ProjectMgrService;
import com.jdddata.dockermgr.bussiness.service.bo.container.list.ContainerListDto;
import com.jdddata.dockermgr.common.docker.DockerClient;
import com.jdddata.dockermgr.common.util.LocalDateTimeUtils;
import com.jdddata.dockermgr.common.util.httpclientutil.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 10:28
 * @modified By:
 */
@Service
public class ProjectMgrServiceImpl implements ProjectMgrService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectMgrServiceImpl.class);

    @Autowired
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private ContainerInfoMapper containerInfoMapper;

    /**
     * 查找所有
     *
     * @return
     */
    @Override
    public List<ProjectMgr> saveOrUpdateContainerInfo() {

        List<ProjectDeployInfo> deployInfos = projectDeployInfoMapper.queryProjectDeployInfo(new ProjectDeployInfo());
        for (ProjectDeployInfo item : deployInfos) {
            String ip = item.getContainerIp();
            HttpResponse httpResponse = DockerClient.listContainers();
            if (httpResponse != null && httpResponse.getStatusCode() == 200) {
                String body = httpResponse.getBody();
                List<ContainerListDto> obj = JSON.parseArray(body, ContainerListDto.class);
                for (ContainerListDto containerListDto : obj) {
                    ContainerInfo containerInfo = new ContainerInfo();
                    containerInfo.setDeployId(item.getId());
                    containerInfo.setContainerId(containerListDto.getId());
                    containerInfo.setContainerName(containerListDto.getNames().get(0).substring(1));
                    containerInfo.setImageName(containerListDto.getImage().split(":")[0]);
                    containerInfo.setImageTag(containerListDto.getImage().split(":")[1]);
                    containerInfo.setImageId(containerListDto.getImageID());
                    containerInfo.setCommand(containerListDto.getCommand());
                    containerInfo.setContianerPorts(JSON.toJSONString(containerListDto.getPorts()));
                    containerInfo.setState(containerListDto.getState());
                    containerInfo.setStatus(containerListDto.getStatus());
                    containerInfoMapper.insertContainerInfo(containerInfo);
                }
            } else {
                LOGGER.error("获取dockerApi信息失败");
            }
        }

        return null;
    }

}
