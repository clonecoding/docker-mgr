package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.Counter;

public interface CounterMapper {
    int insert(Counter record);

    int insertSelective(Counter record);
}