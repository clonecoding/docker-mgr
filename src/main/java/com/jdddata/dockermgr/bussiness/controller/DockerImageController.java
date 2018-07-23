package com.jdddata.dockermgr.bussiness.controller;

import com.jdddata.dockermgr.bussiness.controller.dto.image.DockerImageDto;
import com.jdddata.dockermgr.bussiness.service.DockerImageService;
import com.jdddata.dockermgr.common.util.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.util.httpclientutil.HttpResponse;
import com.jdddata.dockermgr.vo.ResultVo;
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
    public ResultVo createImage(@RequestBody DockerImageDto dockerImageDto) {

        return dockerImageService.createImage(dockerImageDto.getServerInfo(),dockerImageDto.getFromImage(),dockerImageDto.getTag());
    }

    @PostMapping("/list")
    public ResultVo list(@RequestBody DockerImageDto dockerImageDto) {
        return dockerImageService.list(dockerImageDto.getServerInfo());
    }

    @PostMapping("/remove")
    public ResultVo remove(@RequestBody DockerImageDto dockerImageDto) {
        return dockerImageService.removeImage(dockerImageDto.getServerInfo(), dockerImageDto.getName());
    }
}
