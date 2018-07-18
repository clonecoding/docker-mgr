package com.jdddata.dockermgr.bussiness.service.impl;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.bussiness.service.DockerContainerService;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.ContainerCreateDto;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 15:26
 * @modified By:
 */
@Service
public class DockerContainerServiceImpl  implements DockerContainerService {
    @Override
    public void createContainer(ContainerCreatePyDto containerCreatePyDto) {



        String name = containerCreatePyDto.getName();
        ContainerCreateDto containerCreateDto = new ContainerCreateDto();

    }
}
