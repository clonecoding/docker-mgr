package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.northbound.dto.git.GitDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.PomParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deploy")
public class DeployPreController {

    @Autowired
    private DeployService deployService;

    @Autowired
    private PomParseService pomParseService;

    @GetMapping("/{projectId}/info")
    public ResultVo info(@PathVariable String projectId) {

        return deployService.fetchPreInfo(projectId);
    }

    @PostMapping("/nexus")
    public ResultVo nexus(@RequestBody GitDto gitDto) {
        return pomParseService.parseFromGit(gitDto);
    }

    @PostMapping("/create")
    public ResultVo create(@RequestBody DeployInfoDto deployInfoDto) {
        return deployService.create(deployInfoDto);
    }
}
