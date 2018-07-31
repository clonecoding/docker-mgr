package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfoDetail;

import java.util.List;

public interface ProjectDeployInfoDetailCMapper {

    List<ProjectDeployInfoDetail> selectByArtiIdIn(List<Long> longs);
}
