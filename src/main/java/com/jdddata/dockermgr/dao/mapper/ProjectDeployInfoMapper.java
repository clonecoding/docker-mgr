package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.modle.ProjectDeployInfo;

import java.util.List;

/**
 * @author zhangheng
 */
public interface ProjectDeployInfoMapper {

    int insertProjectDeployInfo(ProjectDeployInfo object);

    int updateProjectDeployInfo(ProjectDeployInfo object);

    int update(ProjectDeployInfo.UpdateBuilder object);

    List<ProjectDeployInfo> queryProjectDeployInfo(ProjectDeployInfo object);

    ProjectDeployInfo queryProjectDeployInfoLimit1(ProjectDeployInfo object);

}