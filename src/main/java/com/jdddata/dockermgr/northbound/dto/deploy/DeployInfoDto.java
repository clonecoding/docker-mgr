package com.jdddata.dockermgr.northbound.dto.deploy;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;

public class DeployInfoDto {

    private Long id;
    /**
     * 1.docker / 2.not docker
     */
    private Integer deployMode;

    /**
     * 宿主机
     * 即分配到哪台机器上
     */
    private String hostIp;

    private String dockerContainerName;

    private String dockerImageName;

    private String dockerEntrypoint;

    private String dockerMount;

    private String dockerLink;

    private String dockerCpusetCpus;

    private String dockerMemory;

    private String getDockerMemorySwap;

    private String dockerMemoryReservation;

    private String dockerMemorySwappiness;

    private String dockerCmd;

    private String dockerEnv;

    private String projectId;

    private String gitUrl;

    private String gitVersion;

    private String nexusTargetUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(Integer deployMode) {
        this.deployMode = deployMode;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getDockerContainerName() {
        return dockerContainerName;
    }

    public void setDockerContainerName(String dockerContainerName) {
        this.dockerContainerName = dockerContainerName;
    }

    public String getDockerImageName() {
        return dockerImageName;
    }

    public void setDockerImageName(String dockerImageName) {
        this.dockerImageName = dockerImageName;
    }

    public String getDockerEntrypoint() {
        return dockerEntrypoint;
    }

    public void setDockerEntrypoint(String dockerEntrypoint) {
        this.dockerEntrypoint = dockerEntrypoint;
    }

    public String getDockerMount() {
        return dockerMount;
    }

    public void setDockerMount(String dockerMount) {
        this.dockerMount = dockerMount;
    }

    public String getDockerLink() {
        return dockerLink;
    }

    public void setDockerLink(String dockerLink) {
        this.dockerLink = dockerLink;
    }

    public String getDockerCpusetCpus() {
        return dockerCpusetCpus;
    }

    public void setDockerCpusetCpus(String dockerCpusetCpus) {
        this.dockerCpusetCpus = dockerCpusetCpus;
    }

    public String getDockerMemory() {
        return dockerMemory;
    }

    public void setDockerMemory(String dockerMemory) {
        this.dockerMemory = dockerMemory;
    }

    public String getGetDockerMemorySwap() {
        return getDockerMemorySwap;
    }

    public void setGetDockerMemorySwap(String getDockerMemorySwap) {
        this.getDockerMemorySwap = getDockerMemorySwap;
    }

    public String getDockerMemoryReservation() {
        return dockerMemoryReservation;
    }

    public void setDockerMemoryReservation(String dockerMemoryReservation) {
        this.dockerMemoryReservation = dockerMemoryReservation;
    }

    public String getDockerMemorySwappiness() {
        return dockerMemorySwappiness;
    }

    public void setDockerMemorySwappiness(String dockerMemorySwappiness) {
        this.dockerMemorySwappiness = dockerMemorySwappiness;
    }

    public String getDockerCmd() {
        return dockerCmd;
    }

    public void setDockerCmd(String dockerCmd) {
        this.dockerCmd = dockerCmd;
    }

    public String getDockerEnv() {
        return dockerEnv;
    }

    public void setDockerEnv(String dockerEnv) {
        this.dockerEnv = dockerEnv;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getGitVersion() {
        return gitVersion;
    }

    public void setGitVersion(String gitVersion) {
        this.gitVersion = gitVersion;
    }

    public ProjectDeployInfo convert() {
        ProjectDeployInfo projectDeployInfo = new ProjectDeployInfo();
        projectDeployInfo.setId(null != this.id ? this.id : null);
        projectDeployInfo.setProjectId(this.projectId);
        projectDeployInfo.setHostIp(this.hostIp);
        projectDeployInfo.setDockerEnv(this.dockerEnv);
        projectDeployInfo.setDeployMode(this.deployMode);
        projectDeployInfo.setGitVersion(this.gitVersion);
        projectDeployInfo.setNexusTargetUrl(this.nexusTargetUrl);
        projectDeployInfo.setDockerContainerName(this.dockerContainerName);
        projectDeployInfo.setDockerImageName(this.dockerImageName);
        projectDeployInfo.setDockerEntrypoint(this.dockerEntrypoint);
        projectDeployInfo.setDockerMount(this.dockerMount);
        projectDeployInfo.setDockerLink(this.dockerLink);
        projectDeployInfo.setDockerCpusetCpus(this.dockerCpusetCpus);
        projectDeployInfo.setDockerMemory(this.dockerMemory);
        projectDeployInfo.setDockerMemorySwap(this.getDockerMemorySwap);
        projectDeployInfo.setDockerMemoryReservation(this.dockerMemoryReservation);
        projectDeployInfo.setDockerMemorySwappiness(this.dockerMemorySwappiness);
//        projectDeployInfo.setIsValid(this.);
//        projectDeployInfo.setIsDelete();
//        projectDeployInfo.setCreateTime();
//        projectDeployInfo.setCreateUser();
//        projectDeployInfo.setUpdateTime();
//        projectDeployInfo.setUpdateUser();

        return projectDeployInfo;
    }

    public String getNexusTargetUrl() {
        return nexusTargetUrl;
    }

    public void setNexusTargetUrl(String nexusTargetUrl) {
        this.nexusTargetUrl = nexusTargetUrl;
    }
}
