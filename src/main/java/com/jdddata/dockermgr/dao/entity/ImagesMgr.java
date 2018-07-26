package com.jdddata.dockermgr.dao.entity;

import java.util.Date;

public class ImagesMgr {
    private String id;

    private String imagename;

    private String imagetag;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public String getImagetag() {
        return imagetag;
    }

    public void setImagetag(String imagetag) {
        this.imagetag = imagetag == null ? null : imagetag.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}