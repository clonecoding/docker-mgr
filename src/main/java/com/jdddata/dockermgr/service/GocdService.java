package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.adapter.gocd.dto.create.PipelineCreateDto;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/30 10:24
 * @modified By:
 */
public interface GocdService {

    /**
     * 创建容器
     * @param projectId
     * @return
     */
   boolean createPipeline(String projectId);
}
