package com.jdddata.dockermgr.common.httpclientutil;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 19:43
 * @modified By:
 */
public class HttpClientResponse {

    private int code;
    private String message;

    public HttpClientResponse() {

    }

    public HttpClientResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
