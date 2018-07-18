package com.jdddata.dockermgr.common.httpclientutil;

import org.apache.http.Header;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 19:43
 * @modified By:
 */
public class HttpResponse {

    private int statusCode;
    private String body;
    private Header[] headers;

    public HttpResponse() {

    }

    public HttpResponse(int code, String body, Header[] headers) {
        this.statusCode = code;
        this.body = body;
        this.headers = headers;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Header[] getHeaders() {
        return headers;
    }

    public void setHeaders(Header[] headers) {
        this.headers = headers;
    }
}
