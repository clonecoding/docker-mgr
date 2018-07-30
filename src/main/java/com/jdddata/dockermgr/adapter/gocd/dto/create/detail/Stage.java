
package com.jdddata.dockermgr.adapter.gocd.dto.create.detail;

import java.util.List;

public class Stage {

    private String name;
    private Boolean fetchMaterials;
    private Boolean cleanWorkingDirectory;
    private Boolean neverCleanupArtifacts;
    private Approval approval;
    private List<Object> environmentVariables = null;
    private List<Job> jobs = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFetchMaterials() {
        return fetchMaterials;
    }

    public void setFetchMaterials(Boolean fetchMaterials) {
        this.fetchMaterials = fetchMaterials;
    }

    public Boolean getCleanWorkingDirectory() {
        return cleanWorkingDirectory;
    }

    public void setCleanWorkingDirectory(Boolean cleanWorkingDirectory) {
        this.cleanWorkingDirectory = cleanWorkingDirectory;
    }

    public Boolean getNeverCleanupArtifacts() {
        return neverCleanupArtifacts;
    }

    public void setNeverCleanupArtifacts(Boolean neverCleanupArtifacts) {
        this.neverCleanupArtifacts = neverCleanupArtifacts;
    }

    public Approval getApproval() {
        return approval;
    }

    public void setApproval(Approval approval) {
        this.approval = approval;
    }

    public List<Object> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(List<Object> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
