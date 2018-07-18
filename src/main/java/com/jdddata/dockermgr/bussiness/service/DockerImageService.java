package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.common.exception.DockerApiReqException;

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


    String List();


    String buildImage(String cmd);

    String createImage(String iamge,String tag) throws DockerApiReqException;

    String pushImage();
}
