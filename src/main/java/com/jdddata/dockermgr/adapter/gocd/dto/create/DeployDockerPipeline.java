package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;
import com.jdddata.dockermgr.common.util.DeployEnvConvert;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeployDockerPipeline {
    private String group;
    private Pipeline pipeline;

    public DeployDockerPipeline(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        this.group = projectMgr.getProjectName() + DeployEnvConvert.toStr(projectDeployInfo.getDeployEnv());
        Pipeline pipeline = createPipelineLocal(projectDeployInfo, projectDeployInfoDetail, projectMgr);
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

    private Pipeline createPipelineLocal(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        Pipeline pipeline = new Pipeline();
        pipeline.setLabelTemplate(PipelineConstants.LABEL_TEMPLATE);
        pipeline.setLockBehavior("none");
        pipeline.setName(projectDeployInfoDetail.getDockerContainerName() + "-deployDocker");
//        pipeline.setTemplate(null);
//        pipeline.setParameters();
        pipeline.setEnvironmentVariables(createEnvLocal(projectDeployInfo, projectDeployInfoDetail, projectMgr));
        pipeline.setMaterials(createMaterialsLocal(projectMgr, projectDeployInfoDetail));
        pipeline.setStages(createStage(projectDeployInfo, projectDeployInfoDetail, projectMgr));
        return pipeline;
    }

    private List<Stage> createStage(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        List<Stage> stages = new ArrayList<>();
        stages.add(createPullDockerImageStage(projectDeployInfo, projectDeployInfoDetail, projectMgr));
        stages.add(createStartDockerContainerStage(projectDeployInfo, projectDeployInfoDetail, projectMgr));
        return null;
    }

    private Stage createStartDockerContainerStage(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        Stage stage = new Stage();
        stage.setName("startDockerContainerStage");
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
        stage.setEnvironmentVariables(new ArrayList<>());
        stage.setJobs(Arrays.asList(createLocalJob_start_container()));
        return stage;
    }

    private Job createLocalJob_start_container() {
        Job job = new Job();
        job.setRunInstanceCount(null);
        job.setTimeout(null);
        job.setEnvironmentVariables(new ArrayList<>());
        job.setResources(new ArrayList<>());
        job.setTasks(Arrays.asList(createLocalTask_start_container()));
        return job;
    }

    private Task createLocalTask_start_container() {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalAttr_start_container());
        return task;
    }

    private Attributes_ createLocalAttr_start_container() {
        Attributes_ attributes_ = new Attributes_();
        attributes_.setRunIf(Arrays.asList("passed"));
        attributes_.setOnCancel(null);
        attributes_.setCommand("/usr/bin/python");
        attributes_.setArguments(Arrays.asList("/data/gocd-scripts/cicd/deploy-python/jdd_test_deploy.py", "start_docker_container"));
        return attributes_;
    }

    private Stage createPullDockerImageStage(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        Stage stage = new Stage();
        stage.setName("pullDockerImageStage");
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
        stage.setEnvironmentVariables(new ArrayList<>());
        stage.setJobs(Arrays.asList(createLocalJob_pull_image()));
        return stage;
    }

    private Job createLocalJob_pull_image() {
        Job job = new Job();
        job.setRunInstanceCount(null);
        job.setTimeout(null);
        job.setEnvironmentVariables(new ArrayList<>());
        job.setResources(new ArrayList<>());
        job.setTasks(Arrays.asList(createLocalTask_pull_image()));
        return job;
    }

    private Task createLocalTask_pull_image() {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalAttr_pull_image());
        return task;
    }

    private Attributes_ createLocalAttr_pull_image() {
        Attributes_ attributes_ = new Attributes_();
        attributes_.setRunIf(Arrays.asList("passed"));
        attributes_.setOnCancel(null);
        attributes_.setCommand("/usr/bin/python");
        attributes_.setArguments(Arrays.asList("/data/gocd-scripts/cicd/deploy-python/jdd_test_deploy.py", "pull_docker_image"));
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

    private List<Material> createMaterialsLocal(ProjectMgr projectMgr, ProjectDeployInfoDetail projectDeployInfoDetail) {
        Material material = new Material();
        material.setType("dependency");
        material.setAttributes(creatLocalAttr(projectMgr, projectDeployInfoDetail));
        List<Material> materials = Arrays.asList(material);
        return materials;
    }

    private Attributes creatLocalAttr(ProjectMgr projectMgr, ProjectDeployInfoDetail projectDeployInfoDetail) {
        Attributes attributes = new Attributes();
        attributes.setPipeline(DeployEnvConvert.fetchAttrNameFromImage(projectDeployInfoDetail.getDockerImageName()) + "-buildDocker");
        attributes.setAutoUpdate(true);
        attributes.setName(DeployEnvConvert.fetchAttrNameFromImage(projectDeployInfoDetail.getDockerImageName()) + "-buildDocker");
        attributes.setStage("buildDockerStage");
        return attributes;
    }

    private List<EnvironmentVariable> createEnvLocal(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        List<EnvironmentVariable> environmentVariables = new ArrayList<>();

        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_SERVER_INFO", projectDeployInfoDetail.getHostIp()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_ENV", projectDeployInfoDetail.getDockerEnv()));
        environmentVariables.add(createEnvVariableLocal(false, "GIT_BRANCH", projectDeployInfoDetail.getGitVersion()));
        environmentVariables.add(createEnvVariableLocal(false, "NEXUS_TARGET_URL", projectDeployInfoDetail.getNexusTargetUrl()));
        environmentVariables.add(createEnvVariableLocal(false, "DOCKER_FILE_URL", projectDeployInfoDetail.getDockerfileUrl()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_CONTAINER_NAME", projectDeployInfoDetail.getDockerContainerName()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_IMAGE_NAME", projectDeployInfoDetail.getDockerImageName()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_ENTRYPOINT", projectDeployInfoDetail.getDockerEntrypoint()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_VOLUME_LIST", projectDeployInfoDetail.getDockerMount()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_LINK", projectDeployInfoDetail.getDockerLink()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_CPUSETS", projectDeployInfoDetail.getDockerCpusetCpus()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM", projectDeployInfoDetail.getDockerMemory()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_SWAP", projectDeployInfoDetail.getDockerMemorySwap()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_RESERVATION", projectDeployInfoDetail.getDockerMemoryReservation()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_SWAPPINESS", projectDeployInfoDetail.getDockerMemorySwappiness()));
        return environmentVariables;

    }

    private EnvironmentVariable createEnvVariableLocal(boolean b, String name, String value) {
        EnvironmentVariable environmentVariable = new EnvironmentVariable();
        environmentVariable.setSecure(b);
        environmentVariable.setName(name);
        environmentVariable.setValue(value);
        return environmentVariable;
    }
}
