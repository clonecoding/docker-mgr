package com.jdddata.dockermgr.dao.mapper;

import java.util.List;

import com.jdddata.dockermgr.dao.modle.ProjectMgr;

/**
*  @author author
*/
public interface ProjectMgrMapper {

    int insertProjectMgr(ProjectMgr object);

    int updateProjectMgr(ProjectMgr object);

    int update(ProjectMgr.UpdateBuilder object);

    List<ProjectMgr> queryProjectMgr(ProjectMgr object);

    ProjectMgr queryProjectMgrLimit1(ProjectMgr object);
}