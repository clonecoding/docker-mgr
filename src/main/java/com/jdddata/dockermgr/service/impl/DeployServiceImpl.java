package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectMgrMapper;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeployServiceImpl implements DeployService {

    @Autowired
    private ProjectMgrMapper projectMgrMapper;

    @Autowired
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private GitService gitService;

    @Override
    public ResultVo fetchPreInfo(String projectId) {
        ProjectMgr projectMgr = projectMgrMapper.selectByPrimaryKey(Long.valueOf(projectId));
        if (null == projectMgr) {
            ResultGenerator.getFail("获取项目信息失败");
        }
        String gitUrl = projectMgr.getGitUrl();
        return gitService.fetchBranches(gitUrl);

    }

    @Override
    public ResultVo create(DeployInfoDto deployInfoDto) {
        projectDeployInfoMapper.insertSelective(deployInfoDto.convert());
        return null;
    }
}
