package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.common.GocdStringCommon.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildDockerPipeline {
    private String group;
    private Pipeline pipeline;


    public BuildDockerPipeline(GocdBoDetail gocdBoDetail, String testExecutableFile) {
        this.group = GocdStrCommon.pipelineGroup(gocdBoDetail.getProjectName(), gocdBoDetail.getDeployEnv());
        Pipeline pipeline = createPipelineLocal(gocdBoDetail, testExecutableFile);
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

    private Pipeline createPipelineLocal(GocdBoDetail gocdBoDetail, String testExecutableFile) {
        Pipeline pipeline = new Pipeline();
        pipeline.setLabelTemplate(PipelineConstants.LABEL_TEMPLATE);
        pipeline.setLockBehavior("none");
        pipeline.setName(GocdStrCommon.buildDockerPipelineName(gocdBoDetail.getDockerImageName()));
//        pipeline.setTemplate(null);
//        pipeline.setParameters();
        pipeline.setEnvironmentVariables(GocdStrCommon.createEnvVariables(gocdBoDetail));
        pipeline.setMaterials(createMaterialsLocal(gocdBoDetail));
        pipeline.setStages(Arrays.asList(createStage(gocdBoDetail, testExecutableFile)));
        return pipeline;
    }

    private Stage createStage(GocdBoDetail gocdBoDetail, String testExecutableFile) {
        Stage stage = new Stage();
        stage.setName(GocdStrCommon.buildDockerStageName());
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
        stage.setEnvironmentVariables(new ArrayList<>());
        stage.setJobs(Arrays.asList(createLocalJobLocal(testExecutableFile)));
        return stage;
    }

    private Job createLocalJobLocal(String testExecutableFile) {
        Job job = new Job();
        job.setName(GocdStrCommon.buildDockerJobName());
        job.setRunInstanceCount(null);
        job.setTimeout(null);
        job.setEnvironmentVariables(new ArrayList<>());
        job.setResources(new ArrayList<>());
        job.setTasks(Arrays.asList(createTaskLocal(testExecutableFile)));
        return job;
    }

    private Task createTaskLocal(String testExecutableFile) {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalAttr(testExecutableFile));
        return task;
    }

    private Attributes_ createLocalAttr(String testExecutableFile) {
        Attributes_ attributes_ = new Attributes_();
        attributes_.setRunIf(Arrays.asList("passed"));
        attributes_.setOnCancel(null);
        attributes_.setCommand("/usr/bin/python");
        attributes_.setArguments(GocdStrCommon.buildDockerArguments(testExecutableFile));
        attributes_.setWorkingDirectory(null);
        return attributes_;
    }

    private Approval createApprovalLocal() {
        Approval approval = new Approval();
        approval.setType("success");
        approval.setAuthorization(createAuthLocal());
        return approval;
    }

    private Authorization createAuthLocal() {
        return new Authorization();
    }

    private List<Material> createMaterialsLocal(GocdBoDetail gocdBoDetail) {
        Material material = new Material();
        material.setType("dependency");
        material.setAttributes(creatLocalAttr(gocdBoDetail));
        return Arrays.asList(material);
    }

    private Attributes creatLocalAttr(GocdBoDetail gocdBoDetail) {
        Attributes attributes = new Attributes();
        attributes.setPipeline(GocdStrCommon.mavenPipelineName(gocdBoDetail));
        attributes.setAutoUpdate(true);
        attributes.setName(GocdStrCommon.mavenPipelineName(gocdBoDetail));
        attributes.setStage(GocdStrCommon.buildDockerDependencyStage(gocdBoDetail));
        return attributes;
    }


}
