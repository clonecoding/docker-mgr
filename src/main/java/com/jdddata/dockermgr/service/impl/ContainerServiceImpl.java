package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ContainerInfoCMapper;
import com.jdddata.dockermgr.dao.entity.ContainerInfo;
import com.jdddata.dockermgr.dao.mapper.ContainerInfoMapper;
import com.jdddata.dockermgr.service.ContainerService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/25 11:36
 * @modified By:
 */
@Service
@Log4j
public class ContainerServiceImpl implements ContainerService {

    @Autowired
    ContainerInfoMapper containerInfoMapper;

    @Autowired
    ContainerInfoCMapper containerInfoCMapper;

    @Override
    public ResultVo<ContainerInfo> list() {
        List<ContainerInfo> containerInfos = containerInfoCMapper.listAll();
        return ResultGenerator.getSuccessDto(containerInfos);
    }

    /**
     * 保存或更新
     *
     * @param containerInfo
     * @return
     */
    @Override
    public boolean saveOrUpdateContainerInfo(ContainerInfo containerInfo) {
        if (Objects.isNull(containerInfo)) {
            log.error("请求参数不能为空");
            return false;
        }
        if (Objects.isNull(containerInfo.getId())) {
            containerInfoMapper.insertSelective(containerInfo);
        } else {
            ContainerInfo cf = containerInfoMapper.selectByPrimaryKey(containerInfo.getId());
            cf.setContainerState(containerInfo.getStatus());
            cf.setStatus(containerInfo.getStatus());
            containerInfoMapper.updateByPrimaryKeySelective(cf);
        }
        return true;
    }

}
