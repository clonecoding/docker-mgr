
package com.jdddata.dockermgr.adapter.gocd.dto.create.detail;


public class Task {

    private String type;
    private Attributes_ attributes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attributes_ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes_ attributes) {
        this.attributes = attributes;
    }

}
