package com.jdddata.dockermgr.bussiness.service.impl;


import com.jdddata.dockermgr.bussiness.modle.ProjectMgr;
import com.jdddata.dockermgr.bussiness.service.ProjectMgrService;
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

    @Test
    public void findAll(){

    }
}
