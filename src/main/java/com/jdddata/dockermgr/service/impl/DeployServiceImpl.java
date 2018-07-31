package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.adapter.gocd.GocdDeployPool;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoArtifactCMapper;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoCMapper;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoDetailCMapper;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoArtifact;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import com.jdddata.dockermgr.dao.mapper.*;
import com.jdddata.dockermgr.northbound.dto.deploy.ArtifactDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDetailDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * TODO 增加gocd配置操作
 */
@Service
public class DeployServiceImpl implements DeployService {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);


    @Autowired
    private GitService gitService;

    @Autowired
    private ProjectMgrMapper projectMgrMapper;

    @Autowired
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private ProjectDeployInfoCMapper projectDeployInfoCMapper;

    @Autowired
    private DockerfileMgrMapper dockerfileMgrMapper;

    @Autowired
    private ProjectDeployInfoArtifactMapper projectDeployInfoArtifactMapper;

    @Autowired
    private ProjectDeployInfoArtifactCMapper projectDeployInfoArtifactCMapper;

    @Autowired
    private ProjectDeployInfoDetailMapper projectDeployInfoDetailMapper;

    @Autowired
    private ProjectDeployInfoDetailCMapper projectDeployInfoDetailCMapper;

    @Override
    public ResultVo fetchPreInfo(String projectId) {
        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(Long.valueOf(projectId));
        if (null == projectMgr) {
            ResultGenerator.getFail("获取项目信息失败");
        }
        String gitUrl = projectMgr.getGitUrl();
        return gitService.fetchBranches(gitUrl);

    }

//    @Override
//    public ResultVo create(DeployInfoDto deployInfoDto) {
//        projectDeployInfoMapper.insertSelective(deployInfoDto.convert());
//        return null;
//    }

    @Override
    public ResultVo saveOrUpdate(DeployInfoDto deployInfoDto) {
        //新增操作
        if (Objects.isNull(deployInfoDto.getId())) {
            int deployId = projectDeployInfoMapper.insertSelective(deployInfoDto.convertEntity());
            List<ArtifactDto> artifactDtoList = deployInfoDto.getArtifactDtoList();
            for (ArtifactDto artifactDto : artifactDtoList) {
                List<DeployInfoDetailDto> deployInfoDetailDtoList = artifactDto.getDeployInfoDetailDtoList();
                int artifactId = projectDeployInfoArtifactMapper.insertSelective(artifactDto.convertEntityWithId(deployId));
                for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDetailDtoList) {
                    projectDeployInfoDetailMapper.insertSelective(deployInfoDetailDto.convertEntityWithId(artifactId));
                }
            }
            GocdBO gocdBo = computeFrom(deployId);
            GocdDeployPool.initProject(gocdBo);
            return ResultGenerator.getSuccess();
        }

//        // 如果部署id不为空，表示是更新操作。
//        ProjectDeployInfo projectDeployInfo = null;
//        List<ProjectDeployInfoDetail> projectDeployInfoDetails = new ArrayList<>();
//        if (Objects.isNull(deployInfoDto.getId())) {
//            for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDto.getDeployInfoDetailDtoList()) {
//                ProjectDeployInfoDetail projectDeployInfoDetail = deployInfoDetailDto.convertoEntity(deployInfoDto.getId());
//                projectDeployInfoDetails.add(projectDeployInfoDetail);
//                if(Objects.nonNull(deployInfoDetailDto.getId())){
//                    projectDeployInfoDetailMapper.updateByPrimaryKeySelective(projectDeployInfoDetail);
//                }else {
//                    projectDeployInfoDetailMapper.insertSelective(projectDeployInfoDetail);
//                }
//            }
//            ProjectDeployInfo deployInfo = deployInfoDto.convert();
//            projectDeployInfo = deployInfo;
//            projectDeployInfoMapper.updateByPrimaryKeySelective(deployInfo);
//        } else {
//            ProjectDeployInfo deployInfo = deployInfoDto.convert();
//            int i = projectDeployInfoMapper.insertSelective(deployInfo);
//            deployInfo.setId(Long.valueOf(i));
//            for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDto.getDeployInfoDetailDtoList()) {
//                ProjectDeployInfoDetail projectDeployInfoDetail = deployInfoDetailDto.convertoEntity(Long.valueOf(i));
//                projectDeployInfoDetails.add(projectDeployInfoDetail);
//                projectDeployInfoDetailMapper.insertSelective(projectDeployInfoDetail);
//            }
//        }
//        Long projectId = projectDeployInfo.getProjectId();
//        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(projectId);
//        GocdDeployPool.initProject(projectDeployInfo,projectDeployInfoDetails,projectMgr);
        return ResultGenerator.getSuccess();
    }

    private GocdBO computeFrom(int deployId) {
        ProjectDeployInfo projectDeployInfo = projectDeployInfoMapper.selectByPrimaryKey(Long.valueOf(deployId));
        Long projectId = projectDeployInfo.getProjectId();
        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(projectId);
        List<ProjectDeployInfoArtifact> projectDeployInfoArtifacts = projectDeployInfoArtifactCMapper.selectByDeployId(deployId);
        List<Long> longs = projectDeployInfoArtifacts.stream().map(ProjectDeployInfoArtifact::getId).collect(Collectors.toList());
        List<ProjectDeployInfoDetail> projectDeployInfoDetails = projectDeployInfoDetailCMapper.selectByArtiIdIn(longs);
        return new GocdBO(projectMgr, projectDeployInfo, projectDeployInfoArtifacts, projectDeployInfoDetails);
    }

//    @Override
//    public ResultVo clone(DeployInfoDto deployInfoDto) {
//        ProjectDeployInfo projectDeployInfo = projectDeployInfoMapper.selectByPrimaryKey(deployInfoDto.getId());
//
//        projectDeployInfo.setId(null);
//        projectDeployInfo.setDockerContainerName(deployInfoDto.getDockerContainerName());
//        int i = projectDeployInfoMapper.insertSelective(projectDeployInfo);
//        if (i < 0) {
//            return ResultGenerator.getSuccess("failed");
//        }
//        return ResultGenerator.getSuccess("ok");
//    }

    @Override
    public ResultVo delete(String id) {
        projectDeployInfoMapper.deleteByPrimaryKey(Long.valueOf(id));
        //TODO 具体delete所有操作
        return ResultGenerator.getSuccess("ok");
    }

    //TODO 把detail信息塞进去
    @Override
    public ResultVo list() {
        return ResultGenerator.getSuccessDto(projectDeployInfoCMapper.listAll());
    }

    /**
     * @return
     * @author zhangheng(赛事)
     * @description 关联详情表
     */
    @Override
    public ResultVo listDetail() {
        projectDeployInfoCMapper.listDetail();
        return null;
    }
}
