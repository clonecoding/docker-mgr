package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;

public interface ProjectDeployInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectDeployInfo record);

    int insertSelective(ProjectDeployInfo record);

    ProjectDeployInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectDeployInfo record);

    int updateByPrimaryKey(ProjectDeployInfo record);
}