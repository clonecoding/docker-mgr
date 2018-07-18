package com.jdddata.dockermgr.bussiness.service.impl;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.bussiness.service.DockerContainerService;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.vo.ResultVo;
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

    @Override
    public ResultVo start(String id, String serverInfo) {

        return null;
    }

    @Override
    public ResultVo stop(String id, String serverInfo) {
        return null;
    }

    @Override
    public ResultVo list(String serverInfo) {
        return null;
    }
}
