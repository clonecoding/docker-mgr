package com.jdddata.dockermgr.northbound.dto.front;

import java.time.LocalDateTime;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/25 10:47
 * @modified By:
 */
public class ContainerDetailInfo {

    private Long deployId;

    private String containerId;

    private String containerName;

    private String imageName;

    private String imageTag;

    private String imageId;

    private String command;

    private java.time.LocalDateTime containerCreateTime;

    private String containerPorts;

    private String state;

    private String status;

    private String networkMode;

    private String deployMode;

    private String dockerEnv;

    private String projectName;

    private String projectGroup;

    private String hostIp;

    public Long getDeployId() {
        return deployId;
    }

    public void setDeployId(Long deployId) {
        this.deployId = deployId;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public LocalDateTime getContainerCreateTime() {
        return containerCreateTime;
    }

    public void setContainerCreateTime(LocalDateTime containerCreateTime) {
        this.containerCreateTime = containerCreateTime;
    }

    public String getContainerPorts() {
        return containerPorts;
    }

    public void setContainerPorts(String containerPorts) {
        this.containerPorts = containerPorts;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public String getDockerEnv() {
        return dockerEnv;
    }

    public void setDockerEnv(String dockerEnv) {
        this.dockerEnv = dockerEnv;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }


}
