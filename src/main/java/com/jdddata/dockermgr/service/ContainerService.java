package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.entity.ContainerInfo;
import com.jdddata.dockermgr.northbound.dto.front.ContainerDetailInfo;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/25 11:36
 * @modified By:
 */
public interface ContainerService {

    ResultVo<ContainerDetailInfo> list();

    /**
     * 保存或更新
     * @return
     */
    boolean saveOrUpdateContainerInfo(ContainerInfo containerInfo);
 }
