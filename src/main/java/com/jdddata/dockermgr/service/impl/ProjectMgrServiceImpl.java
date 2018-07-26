package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.mapper.ContainerInfoMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectDeployInfoMapper;
import com.jdddata.dockermgr.dao.mapper.ProjectMgrMapper;
import com.jdddata.dockermgr.dao.modle.ContainerInfo;
import com.jdddata.dockermgr.dao.modle.ProjectMgr;
import com.jdddata.dockermgr.service.ProjectMgrService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 10:28
 * @modified By:
 */
@Service
@Log4j
public class ProjectMgrServiceImpl implements ProjectMgrService {

    @Autowired
    private ProjectDeployInfoMapper projectDeployInfoMapper;

    @Autowired
    private ContainerInfoMapper containerInfoMapper;

    @Autowired
    private ProjectMgrMapper projectMgrMapper;

    /**
     * 查找所有
     *
     * @return
     */
    @Override
    public boolean saveOrUpdateContainerInfo(ContainerInfo containerInfo) {
        if (Objects.isNull(containerInfo) ) {
            log.error("请求参数不能为空");
            return false;
        }
        List<ContainerInfo>  containerInfos =containerInfoMapper.queryContainerInfo(ContainerInfo.Build().deployId(containerInfo.getDeployId()).build());
        if(Objects.isNull(containerInfos) || containerInfos.size() == 0){
            containerInfoMapper.insertContainerInfo(containerInfo);
        }else {
           ContainerInfo cf =  containerInfos.get(0);
           cf.setState(containerInfo.getState());
           cf.setStatus(containerInfo.getStatus());
           containerInfoMapper.updateContainerInfo(cf);
        }
        return true;
    }

    @Override
    public ResultVo<ProjectMgr> listProject() {
        List<ProjectMgr> mgrList = projectMgrMapper.queryProjectMgr(new ProjectMgr());
        return ResultGenerator.getSuccess(mgrList);
    }

}
