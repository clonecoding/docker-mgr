package com.jdddata.dockermgr.northbound.dto.deploy;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoArtifact;

import java.util.List;

public class ArtifactDto {
    private Long id;

    private Long projectDeployInfoId;

    /**
     * project artifect_id
     */
    private String name;

    private String nexusUrl;

    private List<DeployInfoDetailDto> deployInfoDetailDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNexusUrl() {
        return nexusUrl;
    }

    public void setNexusUrl(String nexusUrl) {
        this.nexusUrl = nexusUrl;
    }

    public List<DeployInfoDetailDto> getDeployInfoDetailDtoList() {
        return deployInfoDetailDtoList;
    }

    public void setDeployInfoDetailDtoList(List<DeployInfoDetailDto> deployInfoDetailDtoList) {
        this.deployInfoDetailDtoList = deployInfoDetailDtoList;
    }

    public ProjectDeployInfoArtifact convertEntityWithId(Long deployId) {
        ProjectDeployInfoArtifact projectDeployInfoArtifact = new ProjectDeployInfoArtifact();
        projectDeployInfoArtifact.setId(this.id);
        projectDeployInfoArtifact.setProjectDeployInfoId(deployId);
        projectDeployInfoArtifact.setArtifactId(this.name);
        projectDeployInfoArtifact.setNexusTargetUrl(this.nexusUrl);
//        projectDeployInfoArtifact.setIsValid();
//        projectDeployInfoArtifact.setIsDelete();
//        projectDeployInfoArtifact.setCreateTime();
//        projectDeployInfoArtifact.setCreateUser();
//        projectDeployInfoArtifact.setUpdateTime();
//        projectDeployInfoArtifact.setUpdateUser();
        return projectDeployInfoArtifact;
    }

    public Long getProjectDeployInfoId() {
        return projectDeployInfoId;
    }

    public void setProjectDeployInfoId(Long projectDeployInfoId) {
        this.projectDeployInfoId = projectDeployInfoId;
    }
}
