package com.jdddata.dockermgr.adapter.gocd;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.adapter.gocd.common.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.common.HttpClientUtil;
import com.jdddata.dockermgr.adapter.gocd.dto.create.BuildDockerPipeline;
import com.jdddata.dockermgr.adapter.gocd.dto.create.DeployDockerPipeline;
import com.jdddata.dockermgr.adapter.gocd.dto.create.GitPipeline;
import com.jdddata.dockermgr.adapter.gocd.dto.create.MavenPipeline;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class GocdDeployPool {

    private static final Logger LOGGER = LoggerFactory.getLogger(GocdDeployPool.class);

    private static final int TEST = 0;
    private static final int PROD = 1;
    private static final String TEST_EXECUTABLE_FILE = "/data/gocd-scripts/cicd/deploy-python/jdd_test_deploy.py";
    private static final String PROD_EXECUTABLE_FILE = "/data/gocd-scripts/cicd/deploy-python/jdd_prod_deploy.py";

    private static final String HOST = "http://192.168.136.158:8153";

    private static final String PIPELINE_CREATE = HOST + "/go/api/admin/pipelines";
//    public static void initProject(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
//        //判断测试还是生产部署
//        switch (projectDeployInfo.getDeployEnv().intValue()) {
//            case 0:
//                processTest(projectDeployInfo, projectDeployInfoDetails, projectMgr);
//                break;
//
//            case 1:
//                processProd(projectDeployInfo, projectDeployInfoDetails, projectMgr);
//                break;
//            default:
//                break;
//        }
//
//    }

//    private static void processProd(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
//
//    }
//
//    private static void processTest(ProjectDeployInfo projectDeployInfo, List<ProjectDeployInfoDetail> projectDeployInfoDetails, ProjectMgr projectMgr) {
//        //创建maven pipeline
//        MavenPipeline mavenPipeline = new MavenPipeline(projectDeployInfo, projectDeployInfoDetails, projectMgr);
//
//        List<BuildDockerPipeline> buildDockerPipelines = new ArrayList<>();
//        computeImages(projectDeployInfoDetails).forEach(projectDeployInfoDetail -> buildDockerPipelines.add(new BuildDockerPipeline(projectDeployInfo, projectDeployInfoDetail, projectMgr)));
//
//        List<DeployDockerPipeline> deployDockerPipelines = new ArrayList<>();
//        projectDeployInfoDetails.forEach(projectDeployInfoDetail -> deployDockerPipelines.add(new DeployDockerPipeline(projectDeployInfo, projectDeployInfoDetail, projectMgr)));
//
//
//    }
//
//    /**
//     * @param projectDeployInfoDetails
//     * @return
//     * @Auther 葛志伟
//     * <p>
//     * 这个方法很厉害，根据某个字段去重
//     * 这个方法的意思是 根据镜像名字去重，因为打镜像包的时候主要打一个，可以根据这个起多个容器
//     */
//    private static List<ProjectDeployInfoDetail> computeImages(List<ProjectDeployInfoDetail> projectDeployInfoDetails) {
//        return projectDeployInfoDetails.stream().collect(
//                collectingAndThen(
//                        toCollection(() -> new TreeSet<>(Comparator.comparing(ProjectDeployInfoDetail::getDockerImageName))), ArrayList::new)
//        );
//    }


    public static void initProject(GocdBO gocdBo) {
        LOGGER.info("step into the #initProject");
        String pipelineGroup = GocdStrCommon.pipelineGroup(gocdBo);
        initPipelineGroup(pipelineGroup);
        switch (gocdBo.getDeployEnv().intValue()) {
            case TEST:
                processTest(gocdBo.getGocdBoDetailList(), TEST_EXECUTABLE_FILE);
                break;
            case PROD:
                processProd(gocdBo.getGocdBoDetailList(), PROD_EXECUTABLE_FILE);
                break;
            default:
                break;
        }

    }

    private static void processProd(List<GocdBoDetail> gocdBoDetailList, String prodExecutableFile) {

        GitPipeline gitPipeline = createGitPipeline(gocdBoDetailList, prodExecutableFile);
        List<BuildDockerPipeline> buildDockerPipelines = createBuildDockerPipeline(gocdBoDetailList, prodExecutableFile);
        List<DeployDockerPipeline> deployDockerPipelines = createDeployDockerPipeline(gocdBoDetailList, prodExecutableFile);
        HttpClientUtil.doPostWithHttps(PIPELINE_CREATE, JSON.toJSONString(gitPipeline));
        HttpClientUtil.doPostWithHttps(PIPELINE_CREATE, JSON.toJSONString(buildDockerPipelines));
        HttpClientUtil.doPostWithHttps(PIPELINE_CREATE, JSON.toJSONString(deployDockerPipelines));
    }

    private static void processTest(List<GocdBoDetail> gocdBoDetailList, String testExecutableFile) {
        MavenPipeline mavenPipeline = createMavenPipeline(gocdBoDetailList);
        List<BuildDockerPipeline> buildDockerPipelines = createBuildDockerPipeline(gocdBoDetailList, testExecutableFile);
        List<DeployDockerPipeline> deployDockerPipelines = createDeployDockerPipeline(gocdBoDetailList, testExecutableFile);
        HttpClientUtil.doPostWithHttps(PIPELINE_CREATE, JSON.toJSONString(mavenPipeline));
        HttpClientUtil.doPostWithHttps(PIPELINE_CREATE, JSON.toJSONString(buildDockerPipelines));
        HttpClientUtil.doPostWithHttps(PIPELINE_CREATE, JSON.toJSONString(deployDockerPipelines));
    }

    private static GitPipeline createGitPipeline(List<GocdBoDetail> gocdBoDetailList, String prodExecutableFile) {
        GocdBoDetail gocdBoDetail = gocdBoDetailList.get(0);
        return new GitPipeline(gocdBoDetail, prodExecutableFile);
    }


    private static List<DeployDockerPipeline> createDeployDockerPipeline(List<GocdBoDetail> gocdBoDetailList, String execFile) {
        List<DeployDockerPipeline> deployDockerPipelines = new ArrayList<>();
        for (GocdBoDetail gocdBoDetail : gocdBoDetailList) {
            deployDockerPipelines.add(new DeployDockerPipeline(gocdBoDetail, execFile));
        }
        return deployDockerPipelines;
    }

    private static List<BuildDockerPipeline> createBuildDockerPipeline(List<GocdBoDetail> gocdBoDetailList, String execFile) {
        List<BuildDockerPipeline> buildDockerPipelines = new ArrayList<>();
        List<GocdBoDetail> gocdBoDetails = gocdBoDetailList.stream().collect(
                collectingAndThen(
                        toCollection(() -> new TreeSet<>(Comparator.comparing(GocdBoDetail::getDockerImageName))), ArrayList::new)
        );
        for (GocdBoDetail gocdBoDetail : gocdBoDetails) {
            buildDockerPipelines.add(new BuildDockerPipeline(gocdBoDetail, execFile));
        }
        return buildDockerPipelines;
    }


    private static MavenPipeline createMavenPipeline(List<GocdBoDetail> gocdBoDetailList) {
        GocdBoDetail gocdBoDetail = gocdBoDetailList.get(0);
        String projectName = gocdBoDetail.getProjectName();
        String gitUrl = gocdBoDetail.getGitUrl();
        String gitVersion = gocdBoDetail.getGitVersion();
        Integer deployEnv = gocdBoDetail.getDeployEnv();
        return new MavenPipeline(projectName, gitUrl, gitVersion, deployEnv);
    }


    /**
     * 这里删除这个pipelinegourp里面所有配置
     *
     * @param pipelineGroup
     */
    private static void initPipelineGroup(String pipelineGroup) {
        LOGGER.info("step into the #initPipelineGroup");
    }
}
