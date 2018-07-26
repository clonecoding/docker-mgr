package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import com.jdddata.dockermgr.dao.entity.ProjectMgrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMgrMapper {
    int countByExample(ProjectMgrExample example);

    int deleteByExample(ProjectMgrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectMgr record);

    int insertSelective(ProjectMgr record);

    List<ProjectMgr> selectByExample(ProjectMgrExample example);

    ProjectMgr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectMgr record, @Param("example") ProjectMgrExample example);

    int updateByExample(@Param("record") ProjectMgr record, @Param("example") ProjectMgrExample example);

    int updateByPrimaryKeySelective(ProjectMgr record);

    int updateByPrimaryKey(ProjectMgr record);
}