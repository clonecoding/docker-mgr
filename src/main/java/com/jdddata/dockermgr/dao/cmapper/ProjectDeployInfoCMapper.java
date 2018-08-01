package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectDeployInfoCMapper extends ProjectDeployInfoMapper {
    @Deprecated
    List<ProjectDeployInfo> listAll();

    List<DeployInfoDto> listDetail();

    List<DeployInfoDto> findByDeployId(@Param("id") Long id);
}
