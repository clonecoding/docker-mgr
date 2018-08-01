package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.common.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GitPipeline {
    private String group;
    private Pipeline pipeline;


    public GitPipeline(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {

    }

    public GitPipeline(GocdBoDetail gocdBoDetail, String prodExecutableFile) {
        this.group = GocdStrCommon.pipelineGroup(gocdBoDetail);
        Pipeline pipeline = createPipelineLocal(gocdBoDetail, prodExecutableFile);
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


    private Pipeline createPipelineLocal(GocdBoDetail gocdBoDetail, String prodExecutableFile) {
        Pipeline pipeline = new Pipeline();
        pipeline.setLabelTemplate(PipelineConstants.LABEL_TEMPLATE);
        pipeline.setLockBehavior("none");
        pipeline.setName(GocdStrCommon.gitPipelineName(gocdBoDetail));
        pipeline.setTemplate(null);
        pipeline.setParameters(new ArrayList<>(0));
        pipeline.setEnvironmentVariables(GocdStrCommon.createEnvVariables(gocdBoDetail));
        pipeline.setMaterials(Arrays.asList(createMaterialsLocal(gocdBoDetail)));
        pipeline.setStages(Arrays.asList(createStagesLocal(gocdBoDetail, prodExecutableFile)));
        return pipeline;
    }

    private Stage createStagesLocal(GocdBoDetail gocdBoDetail, String prodExecutableFile) {
        Stage stage = new Stage();
        stage.setName(GocdStrCommon.gitPipelineStageName());
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
//        stage.setEnvironmentVariables();
        stage.setJobs(createJobLocal(gocdBoDetail, prodExecutableFile));
        return stage;
    }

    private Material createMaterialsLocal(GocdBoDetail gocdBoDetail) {
        Material material = new Material();
        material.setType("dependency");
        material.setAttributes(createMaterialsAttr(gocdBoDetail));
        return material;
    }

    private Attributes createMaterialsAttr(GocdBoDetail gocdBoDetail) {
        Attributes attributes = new Attributes();
        attributes.setPipeline(GocdStrCommon.mavenPipelineName(gocdBoDetail));
        attributes.setAutoUpdate(true);
        attributes.setName(GocdStrCommon.mavenPipelineName(gocdBoDetail));
        attributes.setStage(GocdStrCommon.mavenPipelineStageName());
        return attributes;
    }


    private List<Job> createJobLocal(GocdBoDetail gocdBoDetail, String prodExecutableFile) {
        Job job = new Job();
        job.setName("gitMvnJob");
//        job.setRunInstanceCount();
//        job.setTimeout();
//        job.setEnvironmentVariables();
//        job.setResources();
        job.setTasks(createTaskLocal(gocdBoDetail, prodExecutableFile));
//        job.setTabs();
//        job.setArtifacts();
//        job.setProperties();
        return Arrays.asList(job);
    }

    private List<Task> createTaskLocal(GocdBoDetail gocdBoDetail, String prodExecutableFile) {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalArtrTask(gocdBoDetail, prodExecutableFile));
        return Arrays.asList(task);
    }

    private Attributes_ createLocalArtrTask(GocdBoDetail gocdBoDetail, String prodExecutableFile) {
        Attributes_ attributes_ = new Attributes_();
//        attributes_.setRunIf();
        attributes_.setCommand("/usr/local/maven/bin/mvn");
//        attributes_.setWorkingDirectory();
//        attributes_.setOnCancel();
        attributes_.setArguments(Arrays.asList(prodExecutableFile, "git_deploy"));
        return attributes_;
    }

    private Approval createApprovalLocal() {
        Approval approval = new Approval();
        approval.setType("success");
//        approval.setAuthorization();
        return approval;
    }
}
