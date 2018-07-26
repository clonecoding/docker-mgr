package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.ResultVo;

public interface DeployService {
    /**
     * 1.git url
     * 2.通过git url 获取 branch and tag
     *
     * @param projectId
     * @return
     */
    ResultVo fetchPreInfo(String projectId);
}
