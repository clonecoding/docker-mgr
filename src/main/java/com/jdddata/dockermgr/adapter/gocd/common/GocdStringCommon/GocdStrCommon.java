package com.jdddata.dockermgr.adapter.gocd.common.GocdStringCommon;

import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.EnvironmentVariable;
import com.jdddata.dockermgr.common.util.DeployEnvConvert;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GocdStrCommon {

    // ###########################################################################
    public static String pipelineGroup(String projectName, Integer deployEnv) {
        return projectName + "-" + DeployEnvConvert.toStr(deployEnv);
    }

    public static String pipelineGroup(GocdBO gocdBo) {
        return pipelineGroup(gocdBo.getProjectName(), gocdBo.getDeployEnv());
    }

    public static List<EnvironmentVariable> createEnvVariables(GocdBoDetail gocdBoDetail) {
        List<EnvironmentVariable> environmentVariables = new ArrayList<>();

        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_SERVER_INFO", gocdBoDetail.getHostIp()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_ENV", gocdBoDetail.getDockerEnv()));
        environmentVariables.add(createEnvVariableLocal(false, "GIT_BRANCH", gocdBoDetail.getGitVersion()));
        environmentVariables.add(createEnvVariableLocal(false, "NEXUS_TARGET_URL", gocdBoDetail.getNexusUrl()));
        environmentVariables.add(createEnvVariableLocal(false, "DOCKER_FILE_URL", gocdBoDetail.getDockerfileUrl()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_CONTAINER_NAME", gocdBoDetail.getDockerContainerName()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_IMAGE_NAME", gocdBoDetail.getDockerImageName()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_ENTRYPOINT", gocdBoDetail.getDockerEntrypoint()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_VOLUME_LIST", gocdBoDetail.getDockerMount()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_LINK", gocdBoDetail.getDockerLink()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_CPUSETS", gocdBoDetail.getDockerCpusetCpus()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM", gocdBoDetail.getDockerMemory()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_SWAP", gocdBoDetail.getDockerMemorySwap()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_RESERVATION", gocdBoDetail.getDockerMemoryReservation()));
        environmentVariables.add(createEnvVariableLocal(false, "PARAMTER_DOCKER_MEM_SWAPPINESS", gocdBoDetail.getDockerMemorySwappiness()));
        return environmentVariables;

    }
    // ###############################################################

    public static String mavenPipelineName(GocdBoDetail gocdBoDetail) {
        return mavenPipelineName(gocdBoDetail.getProjectName());
    }

    public static String mavenPipelineName(String projectName) {
        return projectName + "-maven";
    }

    //######################################################################

    public static String buildDockerPipelineName(String dockerImageName) {
        return DeployEnvConvert.fetchAttrNameFromImage(dockerImageName) + "-buildDocker";

    }


    public static String buildDockerDependencyStage(GocdBoDetail gocdBoDetail) {
        if (gocdBoDetail.getDeployEnv().intValue() == 0) {
            return "mvnDeployStage";
        }
        return "mvnGitStage";
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

    //-------------------------------------------------------------------------------------

    private static EnvironmentVariable createEnvVariableLocal(boolean b, String name, String value) {
        EnvironmentVariable environmentVariable = new EnvironmentVariable();
        environmentVariable.setSecure(b);
        environmentVariable.setName(name);
        environmentVariable.setValue(value);
        return environmentVariable;
    }
}
