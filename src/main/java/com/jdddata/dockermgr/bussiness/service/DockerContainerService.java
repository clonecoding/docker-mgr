package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.vo.ResultVo;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 15:25
 * @modified By:
 */
public interface DockerContainerService {
    void createContainer(ContainerCreatePyDto containerCreatePyDto);

    ResultVo start(String id, String serverInfo);

    ResultVo stop(String id, String serverInfo);

    ResultVo list(String serverInfo);

}
