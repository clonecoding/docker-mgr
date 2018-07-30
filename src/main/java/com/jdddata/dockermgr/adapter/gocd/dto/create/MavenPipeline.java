package com.jdddata.dockermgr.adapter.gocd.dto.create;

import com.jdddata.dockermgr.adapter.gocd.dto.create.detail.Pipeline;
import com.jdddata.dockermgr.common.util.DeployEnvConvert;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;

import java.util.List;

public class MavenPipeline {
    private String group;
    private Pipeline pipeline;

    public MavenPipeline(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        this.group = projectMgr.getProjectName() + DeployEnvConvert.toStr(projectDeployInfo.getDeployEnv());
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
}
