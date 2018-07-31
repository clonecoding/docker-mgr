package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoArtifact;

public interface ProjectDeployInfoArtifactMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectDeployInfoArtifact record);

    int insertSelective(ProjectDeployInfoArtifact record);

    ProjectDeployInfoArtifact selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectDeployInfoArtifact record);

    int updateByPrimaryKey(ProjectDeployInfoArtifact record);
}