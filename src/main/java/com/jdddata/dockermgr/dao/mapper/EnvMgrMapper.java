package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.EnvMgr;

public interface EnvMgrMapper {
    int insert(EnvMgr record);

    int insertSelective(EnvMgr record);
}