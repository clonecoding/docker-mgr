package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.entity.DockerfileMgr;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/1 9:19
 * @modified By:
 */
public interface DockerfileMgrService {

    /**
     * @author zhangheng(赛事)
     * @description
     * @return
     */
    ResultVo<DockerfileMgr> listAll();
}
