package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.ImagesMgr;

public interface ImagesMgrMapper {
    int insert(ImagesMgr record);

    int insertSelective(ImagesMgr record);
}