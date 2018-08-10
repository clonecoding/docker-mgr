package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.RollbackDetail;

public interface RollbackDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RollbackDetail record);

    int insertSelective(RollbackDetail record);

    RollbackDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RollbackDetail record);

    int updateByPrimaryKey(RollbackDetail record);
}