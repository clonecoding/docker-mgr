package com.jdddata.dockermgr.adapter.gocd.common.GocdStringCommon;

import com.jdddata.dockermgr.common.util.DeployEnvConvert;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;

public class GocdStrCommon {

    public static String pipelineGroup(String projectName, Integer deployEnv) {
        return projectName + "-" + DeployEnvConvert.toStr(deployEnv);
    }

    public static String pipelineGroup(GocdBO gocdBo) {
        return gocdBo.getProjectName() + "-" + DeployEnvConvert.toStr(gocdBo.getDeployEnv());
    }
}
