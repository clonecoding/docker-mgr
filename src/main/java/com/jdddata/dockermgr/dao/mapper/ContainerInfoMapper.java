package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ContainerInfo;

public interface ContainerInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContainerInfo record);

    int insertSelective(ContainerInfo record);

    ContainerInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContainerInfo record);

    int updateByPrimaryKey(ContainerInfo record);
}