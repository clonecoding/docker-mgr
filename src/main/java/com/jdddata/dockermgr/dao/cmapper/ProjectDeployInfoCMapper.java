package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;

import java.util.List;

public interface ProjectDeployInfoCMapper extends ProjectDeployInfoMapper {
    List<ProjectDeployInfo> listAll();

    List<DeployInfoDto> listDetail();
}
