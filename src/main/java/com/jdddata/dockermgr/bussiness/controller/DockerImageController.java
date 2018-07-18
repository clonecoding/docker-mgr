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

    @GetMapping("/{serverInfo}/{fromImage}/{tag}/create")
    public ResultVo createImage(@PathVariable("serverInfo") String serverInfo,
                                @PathVariable("fromImage") String fromImage,
                                @PathVariable("tag") String tag) {
        return dockerImageService.createImage(serverInfo, fromImage, tag);
    }

    @GetMapping("{serverInfo}/list")
    public ResultVo List(@PathVariable("serverInfo") String serverInfo) {
        return dockerImageService.list(serverInfo);
    }

    @DeleteMapping("/{serverInfo}/{name}/remove/")
    public ResultVo remove(@PathVariable("serverInfo") String serverInfo,
                           @PathVariable("name") String name) {
        return dockerImageService.removeImage(serverInfo,name);
    }
}
