package com.jdddata.dockermgr.dao.entity;

import java.util.Date;

public class RollbackDetail {
    private Long id;

    private Long projectId;

    private Integer rollbackStatus;

    private String rollbackVersion;

    private Date rollbackTime;

    private String rollbackUser;

    private String rollbackReason;

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

    public Integer getRollbackStatus() {
        return rollbackStatus;
    }

    public void setRollbackStatus(Integer rollbackStatus) {
        this.rollbackStatus = rollbackStatus;
    }

    public String getRollbackVersion() {
        return rollbackVersion;
    }

    public void setRollbackVersion(String rollbackVersion) {
        this.rollbackVersion = rollbackVersion == null ? null : rollbackVersion.trim();
    }

    public Date getRollbackTime() {
        return rollbackTime;
    }

    public void setRollbackTime(Date rollbackTime) {
        this.rollbackTime = rollbackTime;
    }

    public String getRollbackUser() {
        return rollbackUser;
    }

    public void setRollbackUser(String rollbackUser) {
        this.rollbackUser = rollbackUser == null ? null : rollbackUser.trim();
    }

    public String getRollbackReason() {
        return rollbackReason;
    }

    public void setRollbackReason(String rollbackReason) {
        this.rollbackReason = rollbackReason == null ? null : rollbackReason.trim();
    }
}