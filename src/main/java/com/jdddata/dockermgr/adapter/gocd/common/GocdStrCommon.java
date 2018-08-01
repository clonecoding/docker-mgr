package com.jdddata.dockermgr.adapter.gocd.common;

import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.EnvironmentVariable;
import com.jdddata.dockermgr.common.util.DeployEnvConvert;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GocdStrCommon {

    // ########################### 公共部分 ####################################
    public static String pipelineGroup(String projectName, Integer deployEnv) {
        return projectName + "-" + DeployEnvConvert.toStr(deployEnv);
    }

    public static String pipelineGroup(GocdBO gocdBo) {
        return pipelineGroup(gocdBo.getProjectName(), gocdBo.getDeployEnv());
    }

    public static String pipelineGroup(GocdBoDetail gocdBoDetail) {
        return pipelineGroup(gocdBoDetail.getProjectName(), gocdBoDetail.getDeployEnv());
    }

    public static List<EnvironmentVariable> createEnvVariables(GocdBoDetail gocdBoDetail) {
        List<EnvironmentVariable> environmentVariables = new ArrayList<>();

        if (StringUtils.isNotBlank(gocdBoDetail.getHostIp())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_SERVER_INFO", gocdBoDetail.getHostIp()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getGitUrl())) {
            environmentVariables.add(createEnvVariableLocal(true, "GIT_URL", secure(gocdBoDetail.getGitUrl())));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerEnv())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_ENV", gocdBoDetail.getDockerEnv()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getGitVersion())) {
            environmentVariables.add(createEnvVariableLocal(false, "GIT_BRANCH", gocdBoDetail.getGitVersion()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getNexusUrl())) {
            environmentVariables.add(createEnvVariableLocal(false, "NEXUS_TARGET_URL", gocdBoDetail.getNexusUrl()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerfileUrl())) {
            environmentVariables.add(createEnvVariableLocal(false, "DOCKER_FILE_URL", gocdBoDetail.getDockerfileUrl()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerContainerName())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_CONTAINER_NAME", gocdBoDetail.getDockerContainerName()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerImageName())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_IMAGE_NAME", gocdBoDetail.getDockerImageName()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerEntrypoint())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_ENTRYPOINT", gocdBoDetail.getDockerEntrypoint()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerMount())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_VOLUME_LIST", gocdBoDetail.getDockerMount()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerLink())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_LINK", gocdBoDetail.getDockerLink()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerCpusetCpus())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_CPUSETS", gocdBoDetail.getDockerCpusetCpus()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerMemory())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM", gocdBoDetail.getDockerMemory()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerMemorySwap())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_SWAP", gocdBoDetail.getDockerMemorySwap()));
        }
        if (StringUtils.isNotBlank(gocdBoDetail.getDockerMemorySwappiness())) {
            environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_SWAPPINESS", gocdBoDetail.getDockerMemorySwappiness()));
        }
        return environmentVariables;

    }


    // #################### maven pipeline 部分 #################################

    public static String mavenPipelineName(GocdBoDetail gocdBoDetail) {
        return mavenPipelineName(gocdBoDetail.getProjectName());
    }

    public static String mavenPipelineName(String projectName) {
        return projectName + "-maven";
    }

    public static String mavenPipelineStageName() {
        return "mvnDeployStage";
    }

    //#################  build docker 部分  ###################################

    public static String buildDockerPipelineName(GocdBoDetail gocdBoDetail) {
        return DeployEnvConvert.fetchAttrNameFromImage(gocdBoDetail.getDockerImageName()) + "-buildDocker" + DeployEnvConvert.toStr(gocdBoDetail.getDeployEnv());

    }

    public static String buildDockerDependencyPipeline(GocdBoDetail gocdBoDetail) {
        if (gocdBoDetail.getDeployEnv() == 0) {
            return mavenPipelineName(gocdBoDetail);
        }
        return gitPipelineName(gocdBoDetail);
    }

    public static String buildDockerDependencyStage(GocdBoDetail gocdBoDetail) {
        if (gocdBoDetail.getDeployEnv().intValue() == 0) {
            return mavenPipelineStageName();
        }
        return gitPipelineStageName();
    }

    public static String buildDockerStageName() {
        return "buildDockerStage";
    }

    public static String buildDockerJobName() {
        return "buildDockerJob";
    }

    public static List<String> buildDockerArguments(String testExecutableFile) {
        return Arrays.asList(testExecutableFile, "create_docker");
    }

    // ########################### deploy docker    ##########################################

    public static String deployDockerDependencyPipeline(GocdBoDetail gocdBoDetail) {

        return buildDockerPipelineName(gocdBoDetail);
    }


    public static String deployDockerDependencyStage(GocdBoDetail gocdBoDetail) {
        return buildDockerStageName();
    }

    public static String deployDockerPullStageName(GocdBoDetail gocdBoDetail) {
        return "pullDockerImageStage";
    }

    public static String deployDockerPipelineName(GocdBoDetail gocdBoDetail) {
        return gocdBoDetail.getDockerContainerName() + "-deployDocker" + DeployEnvConvert.toStr(gocdBoDetail.getDeployEnv());
    }


    public static String deployDockerStartStageName(GocdBoDetail gocdBoDetail) {
        return "startDockerContainerStage";
    }

    public static List<String> deployDockerPullImageArguments(String execFile) {
        return Arrays.asList(execFile, "pull_docker");
    }


    public static List<String> deployDockerStartContainerArguments(String execFile) {
        return Arrays.asList(execFile, "start_docker_container");
    }

    //#############################   git deploy   #######################################
    public static String gitPipelineName(GocdBoDetail gocdBoDetail) {
        return gitPipelineName(gocdBoDetail.getProjectName());
    }

    public static String gitPipelineName(String projectName) {
        return projectName + "-git";
    }

    public static String gitPipelineStageName() {
        return "gitmvnStage";
    }
    //-------------------------------------------------------------------------------------

    private static EnvironmentVariable createEnvVariableLocal(boolean b, String name, String value) {
        EnvironmentVariable environmentVariable = new EnvironmentVariable();
        environmentVariable.setSecure(b);
        environmentVariable.setName(name);
        environmentVariable.setValue(value);
        return environmentVariable;
    }

    private static String secure(String gitUrl) {
        return gitUrl.replace("https://", "https://gezhiwei:12345678@");
    }

    public static String deployDockerPipelinePullImageJobName() {
        return "deployDockerPullImageJob";
    }

    public static String deployDockerPipelineStartContainerJobName() {
        return "deployDockerStartContainerJob";
    }
}
