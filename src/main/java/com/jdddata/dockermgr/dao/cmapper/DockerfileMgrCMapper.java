package com.jdddata.dockermgr.dao.cmapper;

import com.jdddata.dockermgr.dao.entity.DockerfileMgr;
import com.jdddata.dockermgr.dao.mapper.DockerfileMgrMapper;

import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/1 9:23
 * @modified By:
 */
public interface DockerfileMgrCMapper extends DockerfileMgrMapper {

    List<DockerfileMgr> listAll();
}
