package com.jdddata.dockermgr.northbound.dto.image;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/20 9:55
 * @modified By:
 */
public class DockerImageDto {
    private String serverInfo;

    private String tag;

    private String fromImage;

    private String name;

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getFromImage() {
        return fromImage;
    }

    public void setFromImage(String fromImage) {
        this.fromImage = fromImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
