package com.jdddata.dockermgr.bussiness.controller;

import com.jdddata.dockermgr.bussiness.service.DockerImageService;
import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/image")
public class DockerImageController {

    @Autowired
    DockerImageService dockerImageService;

    @RequestMapping("/create")
    @ResponseBody
    public String createImage(String fromImage, String tag){
        String responseMsg = null;
        try {
              responseMsg = dockerImageService.createImage(fromImage,tag);
        } catch (DockerApiReqException e) {
            responseMsg = "error";
            e.printStackTrace();

        }
        return responseMsg;
    }
}
