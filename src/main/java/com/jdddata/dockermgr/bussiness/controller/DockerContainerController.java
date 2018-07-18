package com.jdddata.dockermgr.bussiness.controller;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.bussiness.service.DockerContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}