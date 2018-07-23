package com.jdddata.dockermgr.bussiness.mapper;

import java.util.List;

import com.jdddata.dockermgr.bussiness.modle.ContainerInfo;
import org.apache.ibatis.annotations.Param;

/**
*  @author zhangheng
*/
public interface ContainerInfoMapper {

    int insertContainerInfo(ContainerInfo object);

    int updateContainerInfo(ContainerInfo object);

    int update(ContainerInfo.UpdateBuilder object);

    List<ContainerInfo> queryContainerInfo(ContainerInfo object);

    ContainerInfo queryContainerInfoLimit1(ContainerInfo object);

}