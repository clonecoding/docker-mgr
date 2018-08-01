package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.service.ContainerService;
import com.jdddata.dockermgr.service.DockerfileMgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/1 9:19
 * @modified By:
 */
@RestController
@RequestMapping("/dockerfile")
public class DockerfileMgrController {

    @Autowired
    DockerfileMgrService dockerfileMgrService;

    @GetMapping("/list")
    public ResultVo listAll() {
        return dockerfileMgrService.listAll();
    }
}
