package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.common.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MavenPipeline {
    private String group;
    private Pipeline pipeline;


    public MavenPipeline(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {
        this.group = GocdStrCommon.pipelineGroup(projectName, deployEnv);
        Pipeline pipeline = createPipelineLocal(projectName, gitUrl, gitVersion, deployEnv);
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

    private Pipeline createPipelineLocal(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {
        Pipeline pipeline = new Pipeline();
        pipeline.setLabelTemplate(PipelineConstants.LABEL_TEMPLATE);
        pipeline.setLockBehavior("none");
        pipeline.setName(GocdStrCommon.mavenPipelineName(projectName));
        pipeline.setTemplate(null);
        pipeline.setParameters(new ArrayList<>(0));
        pipeline.setEnvironmentVariables(new ArrayList<>(0));
        pipeline.setMaterials(Arrays.asList(createMaterialsLocal(projectName, gitUrl, gitVersion, deployEnv)));
        pipeline.setStages(Arrays.asList(createStagesLocal(projectName, gitUrl, gitVersion, deployEnv)));
        return pipeline;
    }

    private Stage createStagesLocal(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {
        Stage stage = new Stage();
        stage.setName("mvnDeployStage");
        stage.setName(GocdStrCommon.mavenPipelineStageName());
        stage.setFetchMaterials(true);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
//        stage.setEnvironmentVariables();
        stage.setJobs(createJobLocal());
        return stage;
    }

    private Material createMaterialsLocal(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {
        Material material = new Material();
        material.setType("git");
        material.setAttributes(createMaterialsAttr(projectName, gitUrl, gitVersion, deployEnv));
        return material;
    }

    private Attributes createMaterialsAttr(String projectName, String gitUrl, String gitVersion, Integer deployEnv) {
        Attributes attributes = new Attributes();
        attributes.setUrl(gitUrl);
        attributes.setDestination(null);
//        attributes.setFilter();
        attributes.setInvertFilter(false);
        attributes.setName(null);
        attributes.setAutoUpdate(true);
        attributes.setBranch(gitVersion);
        attributes.setSubmoduleFolder(null);
        attributes.setShallowClone(false);
        attributes.setPipeline(null);
        attributes.setStage(null);
        return attributes;
    }


    private List<Job> createJobLocal() {
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
}
