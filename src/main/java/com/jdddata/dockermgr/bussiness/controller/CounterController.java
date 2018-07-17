package com.jdddata.dockermgr.bussiness.controller;

import com.jdddata.dockermgr.bussiness.controller.dto.CounterDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterController {

    @PostMapping("/create")
    public String createCounter(@RequestBody CounterDto counterDto) {
        // 首先根据pipelinegourp 等细节东西获取当前的状态
        //

        return null;
    }
}
