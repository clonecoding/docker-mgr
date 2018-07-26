package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.EnvMgr;
import com.jdddata.dockermgr.dao.entity.EnvMgrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnvMgrMapper {
    int countByExample(EnvMgrExample example);

    int deleteByExample(EnvMgrExample example);

    int insert(EnvMgr record);

    int insertSelective(EnvMgr record);

    List<EnvMgr> selectByExample(EnvMgrExample example);

    int updateByExampleSelective(@Param("record") EnvMgr record, @Param("example") EnvMgrExample example);

    int updateByExample(@Param("record") EnvMgr record, @Param("example") EnvMgrExample example);
}