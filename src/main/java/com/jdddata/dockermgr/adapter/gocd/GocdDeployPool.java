package com.jdddata.dockermgr.adapter.gocd;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;

import java.util.List;

public class GocdDeployPool {

    public static void initProject(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        //判断测试还是生产部署
        switch (projectDeployInfo.getDeployEnv().intValue()) {
            case 0:
                processTest(projectDeployInfo, projectDeployInfoDetails,projectMgr);
                break;

            case 1:
                processProd(projectDeployInfo, projectDeployInfoDetails,projectMgr);
                break;
            default:
                break;
        }

    }

    private static void processProd(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {

    }

    private static void processTest(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        //创建maven pipeline

    }

}
