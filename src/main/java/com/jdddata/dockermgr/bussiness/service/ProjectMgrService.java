package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.bussiness.modle.ProjectMgr;

import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 10:27
 * @modified By:
 */
public interface ProjectMgrService {

    /**
     * 查找所有
     * @return
     */
    List<ProjectMgr> saveOrUpdateContainerInfo();

}
