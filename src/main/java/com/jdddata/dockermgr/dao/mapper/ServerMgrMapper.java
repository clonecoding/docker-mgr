package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ServerMgr;

public interface ServerMgrMapper {
    int insert(ServerMgr record);

    int insertSelective(ServerMgr record);
}