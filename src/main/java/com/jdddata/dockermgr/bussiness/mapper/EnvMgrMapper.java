package com.jdddata.dockermgr.bussiness.mapper;

import java.util.List;

import com.jdddata.dockermgr.bussiness.modle.EnvMgr;

/**
*  @author author
*/
public interface EnvMgrMapper {

    int insertEnvMgr(EnvMgr object);

    int updateEnvMgr(EnvMgr object);

    int update(EnvMgr.UpdateBuilder object);

    List<EnvMgr> queryEnvMgr(EnvMgr object);

    EnvMgr queryEnvMgrLimit1(EnvMgr object);

}