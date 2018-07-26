package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ProjectMgr;

public interface ProjectMgrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectMgr record);

    int insertSelective(ProjectMgr record);

    ProjectMgr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectMgr record);

    int updateByPrimaryKey(ProjectMgr record);
}