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
    private String projectId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
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

    public ProjectDeployInfo convertEntity() {
        ProjectDeployInfo projectDeployInfo = new ProjectDeployInfo();
        projectDeployInfo.setId(this.id);
        projectDeployInfo.setProjectId(Long.valueOf(this.projectId));
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
