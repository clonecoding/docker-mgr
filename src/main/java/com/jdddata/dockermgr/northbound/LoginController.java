package com.jdddata.dockermgr.northbound;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

/**
 * Created by chen on 2018/4/20.
 */

@Controller
@RequestMapping("/login")
@Log4j
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String Login(String userName,String userPassword){
        String key = UUID.randomUUID().toString().replaceAll("-", "");


        return null;
    }

}
