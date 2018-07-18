package com.jdddata.dockermgr.bussiness.controller;

import com.jdddata.dockermgr.bussiness.service.DockerImageService;
import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import com.jdddata.dockermgr.vo.ResultGenerator;
import com.jdddata.dockermgr.vo.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangheng(赛事)
 * @description docker Image 接口
 */
@RestController
@RequestMapping("/docker/image")
public class DockerImageController {

    @Autowired
    DockerImageService dockerImageService;

    @PostMapping("/create")
    public ResultVo createImage(String fromImage, String tag) {
        return dockerImageService.createImage(fromImage, tag);
    }

    @GetMapping("/list")
    public ResultVo List() {
        return dockerImageService.list();
    }

    @DeleteMapping("/remove/{imageNameOrId}")
    public ResultVo remove(@PathVariable("imageNameOrId") String imageNameOrId) {
        return dockerImageService.removeImage(imageNameOrId);
    }
}
