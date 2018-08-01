package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.common.GocdStringCommon.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeployDockerPipeline {
    private String group;
    private Pipeline pipeline;

    public DeployDockerPipeline(GocdBoDetail gocdBoDetail, String execFile) {
        this.group = GocdStrCommon.pipelineGroup(gocdBoDetail.getProjectName(), gocdBoDetail.getDeployEnv());
        Pipeline pipeline = createPipelineLocal(gocdBoDetail, execFile);
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

    private Pipeline createPipelineLocal(GocdBoDetail gocdBoDetail, String execFile) {
        Pipeline pipeline = new Pipeline();
        pipeline.setLabelTemplate(PipelineConstants.LABEL_TEMPLATE);
        pipeline.setLockBehavior("none");
        pipeline.setName(GocdStrCommon.deployDockerPipelineName(gocdBoDetail));
//        pipeline.setTemplate(null);
//        pipeline.setParameters();
        pipeline.setEnvironmentVariables(GocdStrCommon.createEnvVariables(gocdBoDetail));
        pipeline.setMaterials(createMaterialsLocal(gocdBoDetail));
        pipeline.setStages(createStage(gocdBoDetail, execFile));
        return pipeline;
    }

    private List<Stage> createStage(GocdBoDetail gocdBoDetail, String execFile) {
        List<Stage> stages = new ArrayList<>();
        stages.add(createPullDockerImageStage(gocdBoDetail, execFile));
        stages.add(createStartDockerContainerStage(gocdBoDetail, execFile));
        return stages;
    }

    private Stage createStartDockerContainerStage(GocdBoDetail gocdBoDetail, String execFile) {
        Stage stage = new Stage();
        stage.setName(GocdStrCommon.deployDockerStartStageName(gocdBoDetail));
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
        stage.setEnvironmentVariables(new ArrayList<>());
        stage.setJobs(Arrays.asList(createLocalJob_start_container(execFile)));
        return stage;
    }

    private Stage createPullDockerImageStage(GocdBoDetail gocdBoDetail, String execFile) {
        Stage stage = new Stage();
        stage.setName(GocdStrCommon.deployDockerPullStageName(gocdBoDetail));
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
        stage.setEnvironmentVariables(new ArrayList<>());
        stage.setJobs(Arrays.asList(createLocalJob_pull_image(gocdBoDetail, execFile)));
        return stage;
    }

    private List<Material> createMaterialsLocal(GocdBoDetail gocdBoDetail) {
        Material material = new Material();
        material.setType("dependency");
        material.setAttributes(creatLocalAttr(gocdBoDetail));
        List<Material> materials = Arrays.asList(material);
        return materials;
    }

    private Attributes creatLocalAttr(GocdBoDetail gocdBoDetail) {
        Attributes attributes = new Attributes();
        attributes.setPipeline(GocdStrCommon.deployDockerDependencyPipeline(gocdBoDetail));
        attributes.setAutoUpdate(true);
        attributes.setName(GocdStrCommon.deployDockerDependencyPipeline(gocdBoDetail));
        attributes.setStage(GocdStrCommon.deployDockerDependencyStage(gocdBoDetail));
        return attributes;
    }

    private Job createLocalJob_start_container(String execFile) {
        Job job = new Job();
        job.setRunInstanceCount(null);
        job.setTimeout(null);
        job.setEnvironmentVariables(new ArrayList<>());
        job.setResources(new ArrayList<>());
        job.setTasks(Arrays.asList(createLocalTask_start_container(execFile)));
        return job;
    }

    private Task createLocalTask_start_container(String execFile) {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalAttr_start_container(execFile));
        return task;
    }

    private Attributes_ createLocalAttr_start_container(String execFile) {
        Attributes_ attributes_ = new Attributes_();
        attributes_.setRunIf(Arrays.asList("passed"));
        attributes_.setOnCancel(null);
        attributes_.setCommand("/usr/bin/python");
        attributes_.setArguments(GocdStrCommon.deployDockerStartContainerArguments(execFile));
        return attributes_;
    }

    private Job createLocalJob_pull_image(GocdBoDetail gocdBoDetail, String execFile) {
        Job job = new Job();
        job.setRunInstanceCount(null);
        job.setTimeout(null);
        job.setEnvironmentVariables(new ArrayList<>());
        job.setResources(new ArrayList<>());
        job.setTasks(Arrays.asList(createLocalTask_pull_image(gocdBoDetail, execFile)));
        return job;
    }

    private Task createLocalTask_pull_image(GocdBoDetail gocdBoDetail, String execFile) {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalAttr_pull_image(gocdBoDetail, execFile));
        return task;
    }

    private Attributes_ createLocalAttr_pull_image(GocdBoDetail gocdBoDetail, String execFile) {
        Attributes_ attributes_ = new Attributes_();
        attributes_.setRunIf(Arrays.asList("passed"));
        attributes_.setOnCancel(null);
        attributes_.setCommand("/usr/bin/python");
        attributes_.setArguments(GocdStrCommon.deployDockerPullImageArguments(execFile));
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
}
