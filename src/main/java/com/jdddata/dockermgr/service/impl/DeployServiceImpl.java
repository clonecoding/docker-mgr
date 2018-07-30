package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoCMapper;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoDetailMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectMgrMapper;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDetailDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if (Objects.isNull(deployInfoDto.getId())) {
            for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDto.getDeployInfoDetailDtoList()) {
                projectDeployInfoDetailMapper.updateByPrimaryKeySelective(deployInfoDetailDto.convertoEntity(deployInfoDto.getId()));
            }
            projectDeployInfoMapper.updateByPrimaryKeySelective(deployInfoDto.convert());
        } else {
            int i = projectDeployInfoMapper.insertSelective(deployInfoDto.convert());
            for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDto.getDeployInfoDetailDtoList()) {
                projectDeployInfoDetailMapper.insertSelective(deployInfoDetailDto.convertoEntity(Long.valueOf(i)));
            }
        }
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
}
