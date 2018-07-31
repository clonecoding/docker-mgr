package com.jdddata.dockermgr.common.vo.gocd;

public class GocdBoDetail {
    private String projectName;

    private Integer deployEnv;

    private String gitUrl;

    private String gitVersion;

    private String artifactIdName;

    private String nexusUrl;

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

    private String dockerfileId;

    private String dockerfileUrl;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getArtifactIdName() {
        return artifactIdName;
    }

    public void setArtifactIdName(String artifactIdName) {
        this.artifactIdName = artifactIdName;
    }

    public String getNexusUrl() {
        return nexusUrl;
    }

    public void setNexusUrl(String nexusUrl) {
        this.nexusUrl = nexusUrl;
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

    public Integer getDeployEnv() {
        return deployEnv;
    }

    public void setDeployEnv(Integer deployEnv) {
        this.deployEnv = deployEnv;
    }
}
