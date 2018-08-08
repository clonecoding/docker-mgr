package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.adapter.gocd.GocdDeployPool;
import com.jdddata.dockermgr.common.exception.ValidatorException;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.gocd.GocdBO;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoArtifactCMapper;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoCMapper;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoDetailCMapper;
import com.jdddata.dockermgr.dao.entity.*;
import com.jdddata.dockermgr.dao.mapper.*;
import com.jdddata.dockermgr.northbound.dto.deploy.ArtifactDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDetailDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
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

    private final Map<String, DeployInfoDto> map = new ConcurrentHashMap<>();

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

    @Transactional
    @Override
    public ResultVo saveOrUpdate(DeployInfoDto deployInfoDto) throws ValidatorException {
        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(deployInfoDto.getProjectId());
        deployInfoDto.setProjectName(projectMgr.getProjectName());
        String proName = null;
        DeployInfoDto infoDto = map.get(deployInfoDto.getProjectName());
        if (null != infoDto) {
            return ResultGenerator.getFail("当前项目正在执行中请稍后");
        }
        try {
            Long deployId;
            proName = deployInfoDto.getProjectName();
            map.put(proName, deployInfoDto);
            //新增操作
            if (!Objects.isNull(deployInfoDto.getId())) {
                deployId = deployInfoDto.getId();
                ProjectDeployInfo projectDeployInfo = deployInfoDto.convertEntity();
                projectDeployInfoMapper.updateByPrimaryKeySelective(projectDeployInfo);
                deleteAll(deployInfoDto.getId());
            } else {
                ProjectDeployInfo projectDeployInfo = deployInfoDto.convertEntity();
                projectDeployInfoMapper.insertSelective(projectDeployInfo);
                deployId = projectDeployInfo.getId();
            }
            List<ArtifactDto> artifactDtoList = deployInfoDto.getArtifactDtoList();
            for (ArtifactDto artifactDto : artifactDtoList) {
                List<DeployInfoDetailDto> deployInfoDetailDtoList = artifactDto.getDeployInfoDetailDtoList();
                ProjectDeployInfoArtifact projectDeployInfoArtifact = artifactDto.convertEntityWithId(deployId);
                projectDeployInfoArtifactMapper.insertSelective(projectDeployInfoArtifact);
                Long artifactId = projectDeployInfoArtifact.getId();
                for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDetailDtoList) {
                    Long dockerfileId = deployInfoDetailDto.getDockerfileId();
                    DockerfileMgr dockerfileMgr = dockerfileMgrMapper.selectByPrimaryKey(dockerfileId);
                    if (null == dockerfileMgr) {
                        throw new ValidatorException("dockerFile不存在");
                    }
                    String dockerfileUrl = dockerfileMgr.getDockerfileUrl();
                    projectDeployInfoDetailMapper.insertSelective(deployInfoDetailDto.convertEntityWithId(artifactId, dockerfileUrl));
                }
            }
            GocdBO gocdBo = computeFrom(deployId);
            GocdDeployPool.initProject(gocdBo);
            return ResultGenerator.getSuccess();
        } finally {
            map.remove(proName);
        }
    }

    private void deleteAll(Long id) {
        List<ProjectDeployInfoArtifact> projectDeployInfoArtifacts = projectDeployInfoArtifactCMapper.selectByDeployId(id);
        List<Long> longs = projectDeployInfoArtifacts.stream().map(ProjectDeployInfoArtifact::getId).collect(Collectors.toList());
        projectDeployInfoDetailCMapper.deleteByArtiIdIn(longs);
        projectDeployInfoArtifactCMapper.deleteByDeployId(id);
    }

    private GocdBO computeFrom(Long deployId) {
        ProjectDeployInfo projectDeployInfo = projectDeployInfoMapper.selectByPrimaryKey(deployId);
        Long projectId = projectDeployInfo.getProjectId();
        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(projectId);
        List<ProjectDeployInfoArtifact> projectDeployInfoArtifacts = projectDeployInfoArtifactCMapper.selectByDeployId(deployId);
        List<Long> longs = projectDeployInfoArtifacts.stream().map(ProjectDeployInfoArtifact::getId).collect(Collectors.toList());
        List<ProjectDeployInfoDetail> projectDeployInfoDetails = projectDeployInfoDetailCMapper.selectByArtiIdIn(longs);
        return new GocdBO(projectMgr, projectDeployInfo, projectDeployInfoArtifacts, projectDeployInfoDetails);
    }

    @Override
    public ResultVo delete(String id) {
        projectDeployInfoMapper.deleteByPrimaryKey(Long.valueOf(id));
        deleteAll(Long.valueOf(id));
        //TODO 具体delete所有操作
        return ResultGenerator.getSuccess("ok");
    }

    @Deprecated
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
        return ResultGenerator.getSuccessDto(projectDeployInfoCMapper.listDetail());
    }

    @Override
    public ResultVo find(String id) {
        return ResultGenerator.getSuccessDto(projectDeployInfoCMapper.findByDeployId(Long.valueOf(id)));
    }
}
