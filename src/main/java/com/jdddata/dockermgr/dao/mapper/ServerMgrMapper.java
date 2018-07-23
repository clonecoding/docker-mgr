package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.modle.ServerMgr;

import java.util.List;

/**
 * @author gzw
 */
public interface ServerMgrMapper {


    int insertServerMgr(ServerMgr object);

    int updateServerMgr(ServerMgr object);

    int update(ServerMgr.UpdateBuilder object);

    List<ServerMgr> queryServerMgr(ServerMgr object);

    ServerMgr queryServerMgrLimit1(ServerMgr object);
}