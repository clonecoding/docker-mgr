package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoArtifact;
import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectDeployInfoArtifactCMapper {

    List<ProjectDeployInfoArtifact> selectByDeployId(@Param("deployId") int deployId);

}
