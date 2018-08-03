package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.northbound.dto.dockerfile.DockerfileVo;
import com.jdddata.dockermgr.service.ContainerService;
import com.jdddata.dockermgr.service.DockerfileMgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/saveOrUpdate")
    public ResultVo saveOrUpdate(@RequestBody  DockerfileVo dockerfileVo) {
        return dockerfileMgrService.saveOrUpdate(dockerfileVo);
    }
}
