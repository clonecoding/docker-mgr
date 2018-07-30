package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ServerMgr;

public interface ServerMgrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ServerMgr record);

    int insertSelective(ServerMgr record);

    ServerMgr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ServerMgr record);

    int updateByPrimaryKey(ServerMgr record);
}