package com.jdddata.dockermgr.dao.mapper;

import java.util.List;

import com.jdddata.dockermgr.dao.modle.ContainerInfo;
import com.jdddata.dockermgr.northbound.dto.front.ContainerDetailInfo;

/**
*  @author zhangheng
*/
public interface ContainerInfoMapper {

    int insertContainerInfo(ContainerInfo object);

    int updateContainerInfo(ContainerInfo object);

    int update(ContainerInfo.UpdateBuilder object);

    List<ContainerInfo> queryContainerInfo(ContainerInfo object);

    ContainerInfo queryContainerInfoLimit1(ContainerInfo object);

    List<ContainerDetailInfo> queryContainerDetailInfo();
}