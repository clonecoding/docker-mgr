package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 10:27
 * @modified By:
 */
public interface ProjectMgrService {


    ResultVo<ProjectMgr> listProject();


    ResultVo saveOrUpdate(ProjectMgr projectMgr);

    ResultVo delete(Long id);


}
