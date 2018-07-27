package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;

public interface DeployService {
    /**
     * 1.git url
     * 2.通过git url 获取 branch and tag
     *
     * @param projectId
     * @return
     */
    ResultVo fetchPreInfo(String projectId);

    ResultVo create(DeployInfoDto deployInfoDto);

    ResultVo saveOrUpdate(DeployInfoDto deployInfoDto);

}
