package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.entity.ProjectMgr;
import com.jdddata.dockermgr.service.ProjectMgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/24 16:20
 * @modified By:
 */
@RestController
@RequestMapping("/project")
public class ProjectMgrController {


    @Autowired
    ProjectMgrService projectMgrService;

    @GetMapping("/list")
    public ResultVo list() {
        return projectMgrService.listProject();
    }


    @PostMapping("/saveOrUpdate")
    public ResultVo saveOrUpdate(ProjectMgr projectMgr) {
        return projectMgrService.saveOrUpdate(projectMgr);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResultVo saveOrUpdate(@PathVariable("id") Long id) {
        return projectMgrService.delete(id);
    }
}
