package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMgrCMapper {
    List<ProjectMgr> selectProjectIsExist(@Param("i") int i);
}
