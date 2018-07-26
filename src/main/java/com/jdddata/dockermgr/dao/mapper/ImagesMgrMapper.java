package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ImagesMgr;
import com.jdddata.dockermgr.dao.entity.ImagesMgrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesMgrMapper {
    int countByExample(ImagesMgrExample example);

    int deleteByExample(ImagesMgrExample example);

    int insert(ImagesMgr record);

    int insertSelective(ImagesMgr record);

    List<ImagesMgr> selectByExample(ImagesMgrExample example);

    int updateByExampleSelective(@Param("record") ImagesMgr record, @Param("example") ImagesMgrExample example);

    int updateByExample(@Param("record") ImagesMgr record, @Param("example") ImagesMgrExample example);
}