package com.jdddata.dockermgr.common.exception;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 13:38
 * @modified By:
 */
public class DockerApiReqException extends Exception {


    public DockerApiReqException(String message, Throwable cause){
        super(message,cause);
    }

    public DockerApiReqException(String message){
        super(message);
    }


}
