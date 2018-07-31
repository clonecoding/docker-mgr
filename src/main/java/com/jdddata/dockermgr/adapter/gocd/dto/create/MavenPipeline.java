package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.common.GocdStringCommon.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;
import com.jdddata.dockermgr.common.util.DeployEnvConvert;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MavenPipeline {
    private String group;
    private Pipeline pipeline;

    public MavenPipeline(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        this.group = projectMgr.getProjectName() + DeployEnvConvert.toStr(projectDeployInfo.getDeployEnv());
        Pipeline pipeline = createPipelineLocal(projectDeployInfo, projectDeployInfoDetails, projectMgr);
        this.pipeline = pipeline;
    }

    public MavenPipeline(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {
        this.group = GocdStrCommon.pipelineGroup(projectName,deployEnv);
        Pipeline pipeline = createPipelineLocal(projectDeployInfo, projectDeployInfoDetails, projectMgr);
        this.pipeline = pipeline;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Pipeline getPipeline() {
        return pipeline;
    }

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    private Pipeline createPipelineLocal(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        Pipeline pipeline = new Pipeline();
        pipeline.setLabelTemplate(PipelineConstants.LABEL_TEMPLATE);
        pipeline.setLockBehavior("none");
        pipeline.setName(projectMgr.getProjectName() + "-maven");
        pipeline.setTemplate(null);
        pipeline.setParameters(new ArrayList<>(0));
        pipeline.setEnvironmentVariables(new ArrayList<>(0));
        pipeline.setMaterials(Arrays.asList(createMaterialsLocal(projectDeployInfo, projectDeployInfoDetails, projectMgr)));
        pipeline.setStages(Arrays.asList(createStagesLocal(projectDeployInfo, projectDeployInfoDetails, projectMgr)));
        return pipeline;
    }

    private Stage createStagesLocal(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        Stage stage = new Stage();
        stage.setName("mvnDeployStage");
        stage.setFetchMaterials(true);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
//        stage.setEnvironmentVariables();
        stage.setJobs(createJobLocal(projectDeployInfo, projectDeployInfoDetails, projectMgr));
        return stage;
    }

    private List<Job> createJobLocal(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        Job job = new Job();
        job.setName("mvnDeployJob");
//        job.setRunInstanceCount();
//        job.setTimeout();
//        job.setEnvironmentVariables();
//        job.setResources();
        job.setTasks(createTaskLocal());
//        job.setTabs();
//        job.setArtifacts();
//        job.setProperties();
        return Arrays.asList(job);
    }

    private List<Task> createTaskLocal() {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalArtrTask());
        return Arrays.asList(task);
    }

    private Attributes_ createLocalArtrTask() {
        Attributes_ attributes_ = new Attributes_();
//        attributes_.setRunIf();
        attributes_.setCommand("/usr/local/maven/bin/mvn");
//        attributes_.setWorkingDirectory();
//        attributes_.setOnCancel();
        attributes_.setArguments(Arrays.asList("clean", "deploy", "-U"));
        return attributes_;
    }

    private Approval createApprovalLocal() {
        Approval approval = new Approval();
        approval.setType("success");
//        approval.setAuthorization();
        return approval;
    }

    private Material createMaterialsLocal(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        Material material = new Material();
        material.setType("git");
        material.setAttributes(createMaterialsAttr(projectDeployInfo, projectDeployInfoDetails, projectMgr));
        return material;
    }

    private Attributes createMaterialsAttr(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        Attributes attributes = new Attributes();
        attributes.setUrl(projectMgr.getGitUrl());
        attributes.setDestination(null);
//        attributes.setFilter();
        attributes.setInvertFilter(false);
        attributes.setName(null);
        attributes.setAutoUpdate(true);
        attributes.setBranch(projectDeployInfo.getGitVersion());
        attributes.setSubmoduleFolder(null);
        attributes.setShallowClone(false);
        attributes.setPipeline(null);
        attributes.setStage(null);
        return attributes;
    }
}
