package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.mapper.ContainerInfoMapper;
import com.jdddata.dockermgr.northbound.dto.front.ContainerDetailInfo;
import com.jdddata.dockermgr.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/25 11:36
 * @modified By:
 */
@Service
public class ContainerServiceImpl implements ContainerService {

    @Autowired
    ContainerInfoMapper containerInfoMapper;

    @Override
    public ResultVo<ContainerDetailInfo> list() {
        List<ContainerDetailInfo> containerDetailInfos = containerInfoMapper.queryContainerDetailInfo();
        return ResultGenerator.getSuccess(containerDetailInfos);
    }
}
