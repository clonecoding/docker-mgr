package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import com.jdddata.dockermgr.vo.ResultVo;

import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 10:36
 * @modified By:
 */
public interface DockerImageService {
    String LIST_URL = "/images/json";
    String BUILD_URL = "/build";

    String CREATE_IMAGE ="/images/create";

    String PUSH_IMAGE ="/images/{name}/push";


    ResultVo list();


    ResultVo buildImage(String cmd);

    ResultVo createImage(String iamge,String tag) ;

    ResultVo pushImage();

    ResultVo removeImage(String imageNameOrId) ;
}
