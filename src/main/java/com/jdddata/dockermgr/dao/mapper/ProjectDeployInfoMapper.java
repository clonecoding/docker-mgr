package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectDeployInfoMapper {
    int countByExample(ProjectDeployInfoExample example);

    int deleteByExample(ProjectDeployInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectDeployInfo record);

    int insertSelective(ProjectDeployInfo record);

    List<ProjectDeployInfo> selectByExample(ProjectDeployInfoExample example);

    ProjectDeployInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectDeployInfo record, @Param("example") ProjectDeployInfoExample example);

    int updateByExample(@Param("record") ProjectDeployInfo record, @Param("example") ProjectDeployInfoExample example);

    int updateByPrimaryKeySelective(ProjectDeployInfo record);

    int updateByPrimaryKey(ProjectDeployInfo record);
}