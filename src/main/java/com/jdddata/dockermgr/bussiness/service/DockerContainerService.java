package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.vo.ResultVo;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 15:25
 * @modified By:
 */
public interface DockerContainerService {
    ResultVo createContainer(ContainerCreatePyDto containerCreatePyDto);

    ResultVo listContainer(String serverInfo);

    ResultVo startContainer(String serverInfo, String name);

    ResultVo stopContainer(String serverInfo, String name);

    ResultVo deleteContainer(String serverInfo, String name);

    ResultVo getSpecContainer(String serverInfo, String name);
}
