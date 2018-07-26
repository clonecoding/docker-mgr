package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.mapper.ProjectMgrMapper;
import com.jdddata.dockermgr.dao.modle.ProjectMgr;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.GitService;
import com.jdddata.dockermgr.service.PomParseService;
import org.eclipse.jgit.api.Git;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeployServiceImpl implements DeployService {

    @Autowired
    private ProjectMgrMapper projectMgrMapper;

    @Autowired
    private PomParseService pomParseService;

    @Autowired
    private GitService gitService;

    @Override
    public ResultVo fetchPreInfo(String projectId) {
        ProjectMgr p  = new ProjectMgr();
        p.setId(Long.valueOf(projectId));
        ProjectMgr projectMgr = projectMgrMapper.queryProjectMgrLimit1(p);
        if (null==projectMgr) {
            ResultGenerator.getFail("获取项目信息失败");
        }
        String gitUrl = projectMgr.getGitUrl();
        return gitService.fetchBranches(gitUrl);

    }
}
