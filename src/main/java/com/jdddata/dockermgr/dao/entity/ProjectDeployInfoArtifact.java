package com.jdddata.dockermgr.dao.entity;

import java.util.Date;

public class ProjectDeployInfoArtifact {
    private Long id;

    private Long projectDeployInfoId;

    private String artifactId;

    private String nexusTargetUrl;

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

    public Long getProjectDeployInfoId() {
        return projectDeployInfoId;
    }

    public void setProjectDeployInfoId(Long projectDeployInfoId) {
        this.projectDeployInfoId = projectDeployInfoId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId == null ? null : artifactId.trim();
    }

    public String getNexusTargetUrl() {
        return nexusTargetUrl;
    }

    public void setNexusTargetUrl(String nexusTargetUrl) {
        this.nexusTargetUrl = nexusTargetUrl == null ? null : nexusTargetUrl.trim();
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