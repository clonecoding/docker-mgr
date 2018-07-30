package com.jdddata.dockermgr.dao.mapper;

import com.jdddata.dockermgr.dao.entity.DockerfileMgr;

public interface DockerfileMgrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DockerfileMgr record);

    int insertSelective(DockerfileMgr record);

    DockerfileMgr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DockerfileMgr record);

    int updateByPrimaryKey(DockerfileMgr record);
}