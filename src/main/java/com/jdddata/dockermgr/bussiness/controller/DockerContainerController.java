package com.jdddata.dockermgr.bussiness.controller;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.bussiness.service.DockerContainerService;
import com.jdddata.dockermgr.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docker/container")
public class DockerContainerController {

    @Autowired
    private DockerContainerService dockerContainerService;

    @PostMapping("/create")
    public String createContainer(@RequestBody ContainerCreatePyDto containerCreatePyDto) {
        dockerContainerService.createContainer(containerCreatePyDto);
        return null;
    }


    @PostMapping("/containers/start")
    public ResultVo start(String id,String serverInfo) {
        return null;
    }
    @PostMapping("/containers/stop")
    public ResultVo stop(String id,String serverInfo) {
        return null;
    }
    @PostMapping("/containers/list")
    public ResultVo list(String serverInfo) {
        return null;
    }

}