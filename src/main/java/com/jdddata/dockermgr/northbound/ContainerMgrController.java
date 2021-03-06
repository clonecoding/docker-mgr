package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/24 16:20
 * @modified By:
 */
@RestController
@RequestMapping("/container")
public class ContainerMgrController {


    @Autowired
    ContainerService containerService;

    @GetMapping("/list")
    public ResultVo listAll() {
        return containerService.list();
    }


}
