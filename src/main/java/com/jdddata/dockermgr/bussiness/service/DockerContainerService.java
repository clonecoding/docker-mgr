package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 15:25
 * @modified By:
 */
public interface DockerContainerService {
    void createContainer(ContainerCreatePyDto containerCreatePyDto);
}
