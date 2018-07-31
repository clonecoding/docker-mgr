package com.jdddata.dockermgr.adapter.gocd;

import com.jdddata.dockermgr.adapter.gocd.dto.create.BuildDockerPipeline;
import com.jdddata.dockermgr.adapter.gocd.dto.create.DeployDockerPipeline;
import com.jdddata.dockermgr.adapter.gocd.dto.create.MavenPipeline;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class GocdDeployPool {

    public static void initProject(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        //判断测试还是生产部署
        switch (projectDeployInfo.getDeployEnv().intValue()) {
            case 0:
                processTest(projectDeployInfo, projectDeployInfoDetails, projectMgr);
                break;

            case 1:
                processProd(projectDeployInfo, projectDeployInfoDetails, projectMgr);
                break;
            default:
                break;
        }

    }

    private static void processProd(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {

    }

    private static void processTest(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
        //创建maven pipeline
        MavenPipeline mavenPipeline = new MavenPipeline(projectDeployInfo, projectDeployInfoDetails, projectMgr);

        List<BuildDockerPipeline> buildDockerPipelines = new ArrayList<>();
        computeImages(projectDeployInfoDetails).forEach(projectDeployInfoDetail -> buildDockerPipelines.add(new BuildDockerPipeline(projectDeployInfo, projectDeployInfoDetail, projectMgr)));

        List<DeployDockerPipeline> deployDockerPipelines = new ArrayList<>();
        projectDeployInfoDetails.forEach(projectDeployInfoDetail -> deployDockerPipelines.add(new DeployDockerPipeline(projectDeployInfo, projectDeployInfoDetail, projectMgr)));


    }

    /**
     * @param projectDeployInfoDetails
     * @return
     * @Auther 葛志伟
     * <p>
     * 这个方法很厉害，根据某个字段去重
     * 这个方法的意思是 根据镜像名字去重，因为打镜像包的时候主要打一个，可以根据这个起多个容器
     */
    private static List<ProjectDeployInfoDetail> computeImages(List<ProjectDeployInfoDetail> projectDeployInfoDetails) {
        return projectDeployInfoDetails.stream().collect(
                collectingAndThen(
                        toCollection(() -> new TreeSet<>(Comparator.comparing(ProjectDeployInfoDetail::getDockerImageName))), ArrayList::new)
        );
    }


    public static void initProject(GocdBO gocdBo) {
    }
}
