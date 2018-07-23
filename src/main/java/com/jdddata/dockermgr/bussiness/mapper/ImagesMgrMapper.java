package com.jdddata.dockermgr.bussiness.mapper;

import java.util.List;

import com.jdddata.dockermgr.bussiness.modle.ImagesMgr;

/**
*  @author author
*/
public interface ImagesMgrMapper {

    int insertImagesMgr(ImagesMgr object);

    int updateImagesMgr(ImagesMgr object);

    int update(ImagesMgr.UpdateBuilder object);

    List<ImagesMgr> queryImagesMgr(ImagesMgr object);

    ImagesMgr queryImagesMgrLimit1(ImagesMgr object);

}