package com.jdddata.dockermgr.bussiness.mapper;

import java.util.List;

import com.jdddata.dockermgr.bussiness.modle.ProjectMgr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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