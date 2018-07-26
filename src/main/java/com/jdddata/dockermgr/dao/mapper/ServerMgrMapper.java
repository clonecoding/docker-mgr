package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ServerMgr;
import com.jdddata.dockermgr.dao.entity.ServerMgrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerMgrMapper {
    int countByExample(ServerMgrExample example);

    int deleteByExample(ServerMgrExample example);

    int insert(ServerMgr record);

    int insertSelective(ServerMgr record);

    List<ServerMgr> selectByExample(ServerMgrExample example);

    int updateByExampleSelective(@Param("record") ServerMgr record, @Param("example") ServerMgrExample example);

    int updateByExample(@Param("record") ServerMgr record, @Param("example") ServerMgrExample example);
}