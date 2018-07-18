
package com.jdddata.dockermgr.bussiness.service.bo.container.list;

import java.util.HashMap;
import java.util.Map;

public class Port {

    private Integer privatePort;
    private Integer publicPort;
    private String type;

    public Integer getPrivatePort() {
        return privatePort;
    }

    public void setPrivatePort(Integer privatePort) {
        this.privatePort = privatePort;
    }

    public Integer getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
