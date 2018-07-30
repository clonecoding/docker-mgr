package com.jdddata.dockermgr.northbound.dto.deploy;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;

import java.util.List;

public class DeployInfoDto {

    private Long id;

    private List<DeployInfoDetailDto> deployInfoDetailDtoList;

    private String projectId;


    private String gitUrl;

    private String gitVersion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DeployInfoDetailDto> getDeployInfoDetailDtoList() {
        return deployInfoDetailDtoList;
    }

    public void setDeployInfoDetailDtoList(List<DeployInfoDetailDto> deployInfoDetailDtoList) {
        this.deployInfoDetailDtoList = deployInfoDetailDtoList;
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
        projectDeployInfo.setId(this.id);
        projectDeployInfo.setProjectId(Long.valueOf(this.projectId));
        projectDeployInfo.setGitVersion(this.gitVersion);
//        projectDeployInfo.setIsValid();
//        projectDeployInfo.setIsDelete();
//        projectDeployInfo.setCreateTime();
//        projectDeployInfo.setCreateUser();
//        projectDeployInfo.setUpdateTime();
//        projectDeployInfo.setUpdateUser();
        return projectDeployInfo;

    }
}
