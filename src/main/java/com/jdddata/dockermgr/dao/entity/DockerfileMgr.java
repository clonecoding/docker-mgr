package com.jdddata.dockermgr.dao.entity;

public class DockerfileMgr {
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
        this.dockerfileName = dockerfileName == null ? null : dockerfileName.trim();
    }

    public String getDockerfileUrl() {
        return dockerfileUrl;
    }

    public void setDockerfileUrl(String dockerfileUrl) {
        this.dockerfileUrl = dockerfileUrl == null ? null : dockerfileUrl.trim();
    }
}