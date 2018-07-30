package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.ProjectDeployInfo;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;

import java.util.List;

public interface ProjectDeployInfoCMapper extends ProjectDeployInfoMapper {
    List<ProjectDeployInfo> listAll();

    /**
     * @author zhangheng(赛事)
     * @description
     * @return
     */
    ProjectDeployInfo findByProjectId(String projectId);

}
