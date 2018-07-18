package com.jdddata.dockermgr.bussiness.controller;

import org.apache.http.HttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/container")
public class DockerContainerController {

    @PostMapping("/create")
    public String createContainer() {

        return null;
    }
}