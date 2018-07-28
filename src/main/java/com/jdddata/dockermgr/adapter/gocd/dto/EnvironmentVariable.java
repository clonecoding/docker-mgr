
package com.jdddata.dockermgr.adapter.gocd.dto;


public class EnvironmentVariable {

    private Boolean secure;
    private String name;
    private String value;

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
