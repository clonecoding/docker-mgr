package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.entity.ContainerInfo;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/25 11:36
 * @modified By:
 */
public interface ContainerService {

    ResultVo<ContainerInfo> list();

    /**
     * 保存或更新
     * @return
     */
    boolean saveOrUpdateContainerInfo(ContainerInfo containerInfo);
 }
