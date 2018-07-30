package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;

public interface ProjectDeployInfoDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectDeployInfoDetail record);

    int insertSelective(ProjectDeployInfoDetail record);

    ProjectDeployInfoDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectDeployInfoDetail record);

    int updateByPrimaryKey(ProjectDeployInfoDetail record);
}