package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.modle.ProjectMgr;
import com.jdddata.dockermgr.service.ProjectMgrService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 10:28
 * @modified By:
 */
@Service
@Log4j
public class ProjectMgrServiceImpl implements ProjectMgrService {

    @Autowired
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private ContainerInfoMapper containerInfoMapper;

    @Autowired
    private ProjectMgrMapper projectMgrMapper;

    @Override
    public ResultVo<ProjectMgr> listProject() {
        List<ProjectMgr> mgrList = projectMgrMapper.queryProjectMgr(ProjectMgr.Build().isDelete(0).build());
        return ResultGenerator.getSuccess(mgrList);
    }

    @Override
    public ResultVo<ProjectMgr> saveOrUpdate(ProjectMgr projectMgr) {
        if (Objects.isNull(projectMgr.getId())) {
            projectMgrMapper.insertProjectMgr(projectMgr);
        } else {
            ProjectMgr projectMgr2 = projectMgrMapper.queryProjectMgrLimit1(
                    ProjectMgr.Build().id(projectMgr.getId()).build());
            projectMgr2.setProjectName(projectMgr.getProjectName());
            projectMgr2.setProjectGroup(projectMgr.getProjectGroup());
            projectMgr2.setContactName(projectMgr.getContactName());
            projectMgr2.setContactMobile(projectMgr.getContactMobile());
            projectMgr2.setContactEmail(projectMgr.getContactEmail());
            projectMgr2.setAlarmEmailAddress(projectMgr.getAlarmEmailAddress());
            projectMgr2.setGitUrl(projectMgr.getGitUrl());
            projectMgr2.setUpdateTime(LocalDateTime.now());
            projectMgrMapper.updateProjectMgr(projectMgr2);
        }
        return ResultGenerator.getSuccess();
    }

    /**
     * 软删除
     *
     * @param id
     * @return
     */
    @Override
    public ResultVo delete(Long id) {
        ProjectMgr projectMgr2 = projectMgrMapper.queryProjectMgrLimit1(
                ProjectMgr.Build().id(id).build());
        if (Objects.nonNull(projectMgr2)) {
            projectMgr2.setIsDelete(1);
            projectMgrMapper.updateProjectMgr(projectMgr2);
        }
        return ResultGenerator.getSuccess();
    }

}
