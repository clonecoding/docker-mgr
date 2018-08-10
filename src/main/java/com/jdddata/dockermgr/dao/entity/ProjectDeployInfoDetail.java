package com.jdddata.dockermgr.dao.entity;

import java.util.Date;

public class ProjectDeployInfoDetail {
    private Long id;

    private Long projectDeployInfoArtifactId;

    private String hostIp;

    private String dockerEnv;

    private Integer deployMode;

    private String gitVersion;

    private String dockerfileUrl;

    private Long dockerfileId;

    private String dockerContainerName;

    private String dockerImageName;

    private String dockerEntrypoint;

    private String dockerCmd;

    private String dockerMount;

    private String dockerPort;

    private String dockerLink;

    private String dockerCpusetCpus;

    private String dockerMemory;

    private String dockerMemorySwap;

    private String dockerMemoryReservation;

    private String dockerMemorySwappiness;

    private Integer isValid;

    private Integer isDelete;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectDeployInfoArtifactId() {
        return projectDeployInfoArtifactId;
    }

    public void setProjectDeployInfoArtifactId(Long projectDeployInfoArtifactId) {
        this.projectDeployInfoArtifactId = projectDeployInfoArtifactId;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp == null ? null : hostIp.trim();
    }

    public String getDockerEnv() {
        return dockerEnv;
    }

    public void setDockerEnv(String dockerEnv) {
        this.dockerEnv = dockerEnv == null ? null : dockerEnv.trim();
    }

    public Integer getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(Integer deployMode) {
        this.deployMode = deployMode;
    }

    public String getGitVersion() {
        return gitVersion;
    }

    public void setGitVersion(String gitVersion) {
        this.gitVersion = gitVersion == null ? null : gitVersion.trim();
    }

    public String getDockerfileUrl() {
        return dockerfileUrl;
    }

    public void setDockerfileUrl(String dockerfileUrl) {
        this.dockerfileUrl = dockerfileUrl == null ? null : dockerfileUrl.trim();
    }

    public Long getDockerfileId() {
        return dockerfileId;
    }

    public void setDockerfileId(Long dockerfileId) {
        this.dockerfileId = dockerfileId;
    }

    public String getDockerContainerName() {
        return dockerContainerName;
    }

    public void setDockerContainerName(String dockerContainerName) {
        this.dockerContainerName = dockerContainerName == null ? null : dockerContainerName.trim();
    }

    public String getDockerImageName() {
        return dockerImageName;
    }

    public void setDockerImageName(String dockerImageName) {
        this.dockerImageName = dockerImageName == null ? null : dockerImageName.trim();
    }

    public String getDockerEntrypoint() {
        return dockerEntrypoint;
    }

    public void setDockerEntrypoint(String dockerEntrypoint) {
        this.dockerEntrypoint = dockerEntrypoint == null ? null : dockerEntrypoint.trim();
    }

    public String getDockerCmd() {
        return dockerCmd;
    }

    public void setDockerCmd(String dockerCmd) {
        this.dockerCmd = dockerCmd == null ? null : dockerCmd.trim();
    }

    public String getDockerMount() {
        return dockerMount;
    }

    public void setDockerMount(String dockerMount) {
        this.dockerMount = dockerMount == null ? null : dockerMount.trim();
    }

    public String getDockerPort() {
        return dockerPort;
    }

    public void setDockerPort(String dockerPort) {
        this.dockerPort = dockerPort == null ? null : dockerPort.trim();
    }

    public String getDockerLink() {
        return dockerLink;
    }

    public void setDockerLink(String dockerLink) {
        this.dockerLink = dockerLink == null ? null : dockerLink.trim();
    }

    public String getDockerCpusetCpus() {
        return dockerCpusetCpus;
    }

    public void setDockerCpusetCpus(String dockerCpusetCpus) {
        this.dockerCpusetCpus = dockerCpusetCpus == null ? null : dockerCpusetCpus.trim();
    }

    public String getDockerMemory() {
        return dockerMemory;
    }

    public void setDockerMemory(String dockerMemory) {
        this.dockerMemory = dockerMemory == null ? null : dockerMemory.trim();
    }

    public String getDockerMemorySwap() {
        return dockerMemorySwap;
    }

    public void setDockerMemorySwap(String dockerMemorySwap) {
        this.dockerMemorySwap = dockerMemorySwap == null ? null : dockerMemorySwap.trim();
    }

    public String getDockerMemoryReservation() {
        return dockerMemoryReservation;
    }

    public void setDockerMemoryReservation(String dockerMemoryReservation) {
        this.dockerMemoryReservation = dockerMemoryReservation == null ? null : dockerMemoryReservation.trim();
    }

    public String getDockerMemorySwappiness() {
        return dockerMemorySwappiness;
    }

    public void setDockerMemorySwappiness(String dockerMemorySwappiness) {
        this.dockerMemorySwappiness = dockerMemorySwappiness == null ? null : dockerMemorySwappiness.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}