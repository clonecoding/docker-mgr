package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.Counter;
import com.jdddata.dockermgr.dao.entity.CounterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounterMapper {
    int countByExample(CounterExample example);

    int deleteByExample(CounterExample example);

    int insert(Counter record);

    int insertSelective(Counter record);

    List<Counter> selectByExample(CounterExample example);

    int updateByExampleSelective(@Param("record") Counter record, @Param("example") CounterExample example);

    int updateByExample(@Param("record") Counter record, @Param("example") CounterExample example);
}