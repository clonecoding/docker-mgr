package com.jdddata.dockermgr.common.vo.gocd;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoArtifact;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GocdBO {

    private Integer deployEnv;

    private List<GocdBoDetail> gocdBoDetailList;

    public GocdBO(ProjectMgr projectMgr, ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoArtifact> projectDeployInfoArtifacts, List<ProjectDeployInfoDetail> projectDeployInfoDetails) {
        this.deployEnv = projectDeployInfo.getDeployEnv();
        this.gocdBoDetailList = createGocdDetailList(projectMgr, projectDeployInfo, projectDeployInfoArtifacts, projectDeployInfoDetails);
    }

    private List<GocdBoDetail> createGocdDetailList(ProjectMgr projectMgr, ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoArtifact> projectDeployInfoArtifacts, List<ProjectDeployInfoDetail> projectDeployInfoDetails) {
        List<GocdBoDetail> gocdBoDetails = new ArrayList<>();
        for (ProjectDeployInfoDetail projectDeployInfoDetail : projectDeployInfoDetails) {
            Long projectDeployInfoArtifactId = projectDeployInfoDetail.getProjectDeployInfoArtifactId();
            List<ProjectDeployInfoArtifact> infoArtifacts = projectDeployInfoArtifacts.stream().filter(p -> p.getId() == projectDeployInfoArtifactId).collect(Collectors.toList());
            ProjectDeployInfoArtifact projectDeployInfoArtifact = infoArtifacts.get(0);
            GocdBoDetail gocdBoDetail = new GocdBoDetail();
            gocdBoDetail.setProjectName(projectMgr.getProjectName());
            gocdBoDetail.setGitUrl(projectMgr.getGitUrl());
            gocdBoDetail.setGitVersion(projectDeployInfo.getGitVersion());
            gocdBoDetail.setArtifactIdName(projectDeployInfoArtifact.getArtifactId());
            gocdBoDetail.setNexusUrl(projectDeployInfoArtifact.getNexusTargetUrl());
            gocdBoDetail.setDeployMode(projectDeployInfoDetail.getDeployMode());
            gocdBoDetail.setHostIp(projectDeployInfoDetail.getHostIp());
            gocdBoDetail.setDockerContainerName(projectDeployInfoDetail.getDockerContainerName());
            gocdBoDetail.setDockerImageName(projectDeployInfoDetail.getDockerImageName());
            gocdBoDetail.setDockerEntrypoint(projectDeployInfoDetail.getDockerEntrypoint());
            gocdBoDetail.setDockerMount(projectDeployInfoDetail.getDockerMount());
            gocdBoDetail.setDockerLink(projectDeployInfoDetail.getDockerLink());
            gocdBoDetail.setDockerCpusetCpus(projectDeployInfoDetail.getDockerCpusetCpus());
            gocdBoDetail.setDockerMemory(projectDeployInfoDetail.getDockerMemory());
            gocdBoDetail.setDockerMemorySwap(projectDeployInfoDetail.getDockerMemorySwap());
            gocdBoDetail.setDockerMemoryReservation(projectDeployInfoDetail.getDockerMemoryReservation());
            gocdBoDetail.setDockerMemorySwappiness(projectDeployInfoDetail.getDockerMemorySwappiness());
            gocdBoDetail.setDockerCmd(projectDeployInfoDetail.getDockerCmd());
            gocdBoDetail.setDockerEnv(projectDeployInfoDetail.getDockerEnv());
            gocdBoDetail.setProjectId(String.valueOf(projectMgr.getId()));
            gocdBoDetail.setDockerfileId(String.valueOf(projectDeployInfoDetail.getDockerfileId()));
            gocdBoDetail.setDockerfileUrl(projectDeployInfoDetail.getDockerfileUrl());
        }
        return gocdBoDetails;
    }

    public Integer getDeployEnv() {
        return deployEnv;
    }

    public void setDeployEnv(Integer deployEnv) {
        this.deployEnv = deployEnv;
    }

    public List<GocdBoDetail> getGocdBoDetailList() {
        return gocdBoDetailList;
    }

    public void setGocdBoDetailList(List<GocdBoDetail> gocdBoDetailList) {
        this.gocdBoDetailList = gocdBoDetailList;
    }

}
