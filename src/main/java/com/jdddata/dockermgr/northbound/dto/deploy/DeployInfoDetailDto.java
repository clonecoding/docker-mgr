package com.jdddata.dockermgr.northbound.dto.deploy;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;

public class DeployInfoDetailDto {

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

    private String dockerMemorySwap;

    private String dockerMemoryReservation;

    private String dockerMemorySwappiness;

    private String dockerCmd;

    private String dockerEnv;

    private String projectId;

    private String gitUrl;

    private String gitVersion;

    private String nexusTargetUrl;

    private String dockerfileId;

    private String dockerfileUrl;

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

    public String getDockerMemorySwap() {
        return dockerMemorySwap;
    }

    public void setDockerMemorySwap(String dockerMemorySwap) {
        this.dockerMemorySwap = dockerMemorySwap;
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

    public String getNexusTargetUrl() {
        return nexusTargetUrl;
    }

    public void setNexusTargetUrl(String nexusTargetUrl) {
        this.nexusTargetUrl = nexusTargetUrl;
    }

    public ProjectDeployInfoDetail convertoEntity(Long id) {
        ProjectDeployInfoDetail projectDeployInfoDetail = new ProjectDeployInfoDetail();
        projectDeployInfoDetail.setId(this.id);
        projectDeployInfoDetail.setProjectId(Long.valueOf(this.projectId));
        projectDeployInfoDetail.setProjectDeployInfoId(id);
        projectDeployInfoDetail.setHostIp(this.hostIp);
        projectDeployInfoDetail.setDockerEnv(this.dockerEnv);
        projectDeployInfoDetail.setDeployMode(this.deployMode);
        projectDeployInfoDetail.setGitVersion(this.gitVersion);
        projectDeployInfoDetail.setNexusTargetUrl(this.nexusTargetUrl);
        projectDeployInfoDetail.setDockerContainerName(this.dockerContainerName);
        projectDeployInfoDetail.setDockerImageName(this.dockerImageName);
        projectDeployInfoDetail.setDockerEntrypoint(this.dockerEntrypoint);
        projectDeployInfoDetail.setDockerMount(this.dockerMount);
        projectDeployInfoDetail.setDockerLink(this.dockerLink);
        projectDeployInfoDetail.setDockerCpusetCpus(this.dockerCpusetCpus);
        projectDeployInfoDetail.setDockerMemory(this.dockerMemory);
        projectDeployInfoDetail.setDockerMemorySwap(this.dockerMemorySwap);
        projectDeployInfoDetail.setDockerMemoryReservation(this.dockerMemoryReservation);
        projectDeployInfoDetail.setDockerMemorySwappiness(this.dockerMemorySwappiness);
        projectDeployInfoDetail.setDockerfileId(Long.valueOf(this.dockerfileId));
        projectDeployInfoDetail.setDockerfileUrl(this.dockerfileUrl);
//        projectDeployInfoDetail.setIsValid(this.dis);
//        projectDeployInfoDetail.setIsDelete();
//        projectDeployInfoDetail.setCreateTime();
//        projectDeployInfoDetail.setCreateUser();
//        projectDeployInfoDetail.setUpdateTime();
//        projectDeployInfoDetail.setUpdateUser();
//        projectDeployInfoDetail.
        return projectDeployInfoDetail;
    }

    public String getDockerfileId() {
        return dockerfileId;
    }

    public void setDockerfileId(String dockerfileId) {
        this.dockerfileId = dockerfileId;
    }

    public String getDockerfileUrl() {
        return dockerfileUrl;
    }

    public void setDockerfileUrl(String dockerfileUrl) {
        this.dockerfileUrl = dockerfileUrl;
    }
}
