package com.jdddata.dockermgr.northbound.dto.deploy;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;

import java.util.List;

public class DeployInfoDto {

    /**
     * deploy id 和分支、环境绑定在一起
     */
    private Long id;

    /**
     * 项目id
     */
    private Long projectId;

    /**
     * 项目名，冗余
     */
    private String projectName;


    /**
     * 0:测试
     * 1：生产
     */
    private Integer deployEnv;

    /**
     * git 参数
     */
    private String gitUrl;
    private String gitVersion;


    private List<ArtifactDto> artifactDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Integer getDeployEnv() {
        return deployEnv;
    }

    public void setDeployEnv(Integer deployEnv) {
        this.deployEnv = deployEnv;
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

    public List<ArtifactDto> getArtifactDtoList() {
        return artifactDtoList;
    }

    public void setArtifactDtoList(List<ArtifactDto> artifactDtoList) {
        this.artifactDtoList = artifactDtoList;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectDeployInfo convertEntity() {
        ProjectDeployInfo projectDeployInfo = new ProjectDeployInfo();
        projectDeployInfo.setId(this.id);
        projectDeployInfo.setProjectId(this.projectId);
        projectDeployInfo.setGitUrl(this.gitUrl);
        projectDeployInfo.setGitVersion(this.gitVersion);
        projectDeployInfo.setDeployEnv(this.deployEnv);
//        projectDeployInfo.setIsValid();
//        projectDeployInfo.setIsDelete();
//        projectDeployInfo.setCreateTime();
//        projectDeployInfo.setCreateUser();
//        projectDeployInfo.setUpdateTime();
//        projectDeployInfo.setUpdateUser();
        return projectDeployInfo;
    }
}
