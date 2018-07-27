
package com.jdddata.dockermgr.adapter.gocd.dto;


public class Approval {

    private String type;
    private Authorization authorization;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

}
