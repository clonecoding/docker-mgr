package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ContainerInfo;
import com.jdddata.dockermgr.northbound.dto.front.ContainerDetailInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContainerInfoCMapper {

    List<ContainerInfo> selectByDeployId(@Param("deployId") Long deployId);

    List<ContainerInfo> listAll();

    int updateDelete(@Param("id")Long id,@Param("delete")Integer delete);
}
