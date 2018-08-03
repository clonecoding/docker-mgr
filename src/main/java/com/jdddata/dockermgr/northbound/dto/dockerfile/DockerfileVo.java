package com.jdddata.dockermgr.northbound.dto.dockerfile;

import com.jdddata.dockermgr.dao.entity.DockerfileMgr;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/2 20:16
 * @modified By:
 */
public class DockerfileVo {

    private Long id;

    private String dockerfileName;

    private String dockerfileUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDockerfileName() {
        return dockerfileName;
    }

    public void setDockerfileName(String dockerfileName) {
        this.dockerfileName = dockerfileName;
    }

    public String getDockerfileUrl() {
        return dockerfileUrl;
    }

    public void setDockerfileUrl(String dockerfileUrl) {
        this.dockerfileUrl = dockerfileUrl;
    }

    public DockerfileMgr convert(){
        DockerfileMgr dockerfileMgr =new DockerfileMgr();
        dockerfileMgr.setDockerfileName(this.dockerfileName);
        dockerfileMgr.setDockerfileUrl(this.dockerfileUrl);
        return dockerfileMgr;
    }
}
