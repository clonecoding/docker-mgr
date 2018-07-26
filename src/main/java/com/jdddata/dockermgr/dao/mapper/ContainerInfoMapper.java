package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ContainerInfo;
import com.jdddata.dockermgr.dao.entity.ContainerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerInfoMapper {
    int countByExample(ContainerInfoExample example);

    int deleteByExample(ContainerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContainerInfo record);

    int insertSelective(ContainerInfo record);

    List<ContainerInfo> selectByExample(ContainerInfoExample example);

    ContainerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContainerInfo record, @Param("example") ContainerInfoExample example);

    int updateByExample(@Param("record") ContainerInfo record, @Param("example") ContainerInfoExample example);

    int updateByPrimaryKeySelective(ContainerInfo record);

    int updateByPrimaryKey(ContainerInfo record);
}