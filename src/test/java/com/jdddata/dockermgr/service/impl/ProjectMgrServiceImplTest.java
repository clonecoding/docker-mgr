package com.jdddata.dockermgr.service.impl;


import com.jdddata.dockermgr.dao.cmapper.ContainerInfoCMapper;
import com.jdddata.dockermgr.dao.cmapper.ServerMgrCMapper;
import com.jdddata.dockermgr.dao.mapper.ServerMgrMapper;
import com.jdddata.dockermgr.service.ProjectMgrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/23 10:40
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectMgrServiceImplTest {
    @Autowired
    ProjectMgrService projectMgrService;
    @Autowired
    ContainerInfoCMapper containerInfoCMapper;
    @Autowired
    ServerMgrCMapper serverMgrCMapper;
    @Test
    public void findAll(){
        List<String> ips= serverMgrCMapper.getIps();
        System.out.println(ips);
    }

    @Test
    public void test2(){
        containerInfoCMapper.updateDelete(3L,1);

    }
}
