package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.adapter.gocd.GocdDeployPool;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoCMapper;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import com.jdddata.dockermgr.dao.mapper.DockerfileMgrMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoDetailMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectMgrMapper;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDetailDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TODO 增加gocd配置操作
 */
@Service
public class DeployServiceImpl implements DeployService {

    @Autowired
    private ProjectMgrMapper projectMgrMapper;

    @Autowired
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private ProjectDeployInfoCMapper projectDeployInfoCMapper;

    @Autowired
    private GitService gitService;

    @Autowired
    private ProjectDeployInfoDetailMapper projectDeployInfoDetailMapper;

    @Autowired
    private DockerfileMgrMapper dockerfileMgrMapper;

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
        // 如果部署id不为空，表示是更新操作。
        ProjectDeployInfo projectDeployInfo = null;
        List<ProjectDeployInfoDetail> projectDeployInfoDetails = new ArrayList<>();
        if (Objects.isNull(deployInfoDto.getId())) {
            for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDto.getDeployInfoDetailDtoList()) {
                ProjectDeployInfoDetail projectDeployInfoDetail = deployInfoDetailDto.convertoEntity(deployInfoDto.getId());
                projectDeployInfoDetails.add(projectDeployInfoDetail);
                if(Objects.nonNull(deployInfoDetailDto.getId())){
                    projectDeployInfoDetailMapper.updateByPrimaryKeySelective(projectDeployInfoDetail);
                }else {
                    projectDeployInfoDetailMapper.insertSelective(projectDeployInfoDetail);
                }
            }
            ProjectDeployInfo deployInfo = deployInfoDto.convert();
            projectDeployInfo = deployInfo;
            projectDeployInfoMapper.updateByPrimaryKeySelective(deployInfo);
        } else {
            ProjectDeployInfo deployInfo = deployInfoDto.convert();
            int i = projectDeployInfoMapper.insertSelective(deployInfo);
            deployInfo.setId(Long.valueOf(i));
            for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDto.getDeployInfoDetailDtoList()) {
                ProjectDeployInfoDetail projectDeployInfoDetail = deployInfoDetailDto.convertoEntity(Long.valueOf(i));
                projectDeployInfoDetails.add(projectDeployInfoDetail);
                projectDeployInfoDetailMapper.insertSelective(projectDeployInfoDetail);
            }
        }
        Long projectId = projectDeployInfo.getProjectId();
        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(projectId);
        GocdDeployPool.initProject(projectDeployInfo,projectDeployInfoDetails,projectMgr);
        return ResultGenerator.getSuccess();
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
