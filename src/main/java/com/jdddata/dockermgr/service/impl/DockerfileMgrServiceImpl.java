package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.DockerfileMgrCMapper;
import com.jdddata.dockermgr.dao.entity.DockerfileMgr;
import com.jdddata.dockermgr.northbound.dto.dockerfile.DockerfileVo;
import com.jdddata.dockermgr.service.DockerfileMgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/1 9:19
 * @modified By:
 */
@Service
public class DockerfileMgrServiceImpl implements DockerfileMgrService {
    @Autowired
    DockerfileMgrCMapper dockerfileMgrCMapper;

    @Override
    public ResultVo<DockerfileMgr> listAll(){
        return ResultGenerator.getSuccessDto(dockerfileMgrCMapper.listAll());
    }

    @Override
    public ResultVo saveOrUpdate(DockerfileVo dockerfileVo) {
        dockerfileMgrCMapper.insert(dockerfileVo.convert());
        return ResultGenerator.getSuccess();
    }
}
