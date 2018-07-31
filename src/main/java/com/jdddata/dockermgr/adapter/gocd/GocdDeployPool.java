package com.jdddata.dockermgr.adapter.gocd;

import com.jdddata.dockermgr.adapter.gocd.common.GocdStringCommon.GocdStrCommon;
import com.jdddata.dockermgr.adapter.gocd.dto.create.MavenPipeline;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;
import com.jdddata.dockermgr.common.vo.gocd.GocdBoDetail;

import java.util.List;

public class GocdDeployPool {

    private static final int TEST = 0;
    private static final int PROD = 1;
    private static final String TEST_EXECUTABLE_FILE = "/data/gocd-scripts/cicd/deploy-python/jdd_test_deploy.py";
    private static final String PROD_EXECUTABLE_FILE = "/data/gocd-scripts/cicd/deploy-python/jdd_prod_deploy.py";
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
    }

    private static void processTest(List<GocdBoDetail> gocdBoDetailList, String testExecutableFile) {
        MavenPipeline mavenPipeline = createMavenPipeline(gocdBoDetailList, testExecutableFile);
    }

    private static MavenPipeline createMavenPipeline(List<GocdBoDetail> gocdBoDetailList, String testExecutableFile) {
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
    }
}
