package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoArtifact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectDeployInfoArtifactCMapper {

    List<ProjectDeployInfoArtifact> selectByDeployId(@Param("deployId") Long deployId);

    void deleteByDeployId(@Param("deployId") Long deployId);
}
