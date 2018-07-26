package com.jdddata.dockermgr.dao.mapper;

import java.util.List;

import com.jdddata.dockermgr.dao.modle.ProjectDeployInfo;
import org.apache.ibatis.annotations.Param;

/**
*  @author zhangheng
*/
public interface ProjectDeployInfoMapper {

    int insertProjectDeployInfo(ProjectDeployInfo object);

    int updateProjectDeployInfo(ProjectDeployInfo object);

    int update(ProjectDeployInfo.UpdateBuilder object);

    List<ProjectDeployInfo> queryProjectDeployInfo(ProjectDeployInfo object);

    ProjectDeployInfo queryProjectDeployInfoLimit1(ProjectDeployInfo object);

}