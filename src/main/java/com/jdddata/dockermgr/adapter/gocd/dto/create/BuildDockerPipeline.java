package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.*;
import com.jdddata.dockermgr.common.constant.PipelineConstants;
import com.jdddata.dockermgr.common.util.DeployEnvConvert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildDockerPipeline {
    private String group;
    private Pipeline pipeline;

    public BuildDockerPipeline(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
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
        pipeline.setName(DeployEnvConvert.fetchAttrNameFromImage(projectDeployInfoDetail.getDockerImageName()) + "-buildDocker");
//        pipeline.setTemplate(null);
//        pipeline.setParameters();
        pipeline.setEnvironmentVariables(createEnvLocal(projectDeployInfo, projectDeployInfoDetail, projectMgr));
        pipeline.setMaterials(createMaterialsLocal(projectMgr));
        pipeline.setStages(Arrays.asList(createStage(projectDeployInfo, projectDeployInfoDetail, projectMgr)));
        return pipeline;
    }

    private Stage createStage(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        Stage stage = new Stage();
        stage.setName("buildDockerStage");
        stage.setFetchMaterials(false);
        stage.setCleanWorkingDirectory(false);
        stage.setNeverCleanupArtifacts(false);
        stage.setApproval(createApprovalLocal());
        stage.setEnvironmentVariables(new ArrayList<>());
        stage.setJobs(Arrays.asList(createLocalJobLocal()));
        return stage;
    }

    private Job createLocalJobLocal() {
        Job job = new Job();
        job.setName("buildDockerJob");
        job.setRunInstanceCount(null);
        job.setTimeout(null);
        job.setEnvironmentVariables(new ArrayList<>());
        job.setResources(new ArrayList<>());
        job.setTasks(Arrays.asList(createTaskLocal()));
        return job;
    }

    private Task createTaskLocal() {
        Task task = new Task();
        task.setType("exec");
        task.setAttributes(createLocalAttr());
        return task;
    }

    private Attributes_ createLocalAttr() {
        Attributes_ attributes_ = new Attributes_();
        attributes_.setRunIf(Arrays.asList("passed"));
        attributes_.setOnCancel(null);
        attributes_.setCommand("/usr/bin/python");
        attributes_.setArguments(Arrays.asList("/data/gocd-scripts/cicd/deploy-python/jdd_test_deploy.py", "create_docker"));
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

    private List<Material> createMaterialsLocal(ProjectMgr projectMgr) {
        Material material = new Material();
        material.setType("dependency");
        material.setAttributes(creatLocalAttr(projectMgr));
        return Arrays.asList(material);
    }

    private Attributes creatLocalAttr(ProjectMgr projectMgr) {
        Attributes attributes = new Attributes();
        attributes.setPipeline(projectMgr.getProjectName() + "-maven");
        attributes.setAutoUpdate(true);
        attributes.setName(projectMgr.getProjectName() + "-maven");
        attributes.setStage("mvnDeployStage");
        return attributes;
    }

    private List<EnvironmentVariable> createEnvLocal(ProjectDeployInfo projectDeployInfo, ProjectDeployInfoDetail projectDeployInfoDetail, ProjectMgr projectMgr) {
        List<EnvironmentVariable> environmentVariables = new ArrayList<>();

        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_SERVER_INFO", projectDeployInfoDetail.getHostIp()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_ENV", projectDeployInfoDetail.getDockerEnv()));
        environmentVariables.add(createEnvVariableLocal(false, "GIT_BRANCH", projectDeployInfoDetail.getGitVersion()));
//        environmentVariables.add(createEnvVariableLocal(false, "NEXUS_TARGET_URL", projectDeployInfoDetail.getNexusTargetUrl()));
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
