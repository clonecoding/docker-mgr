package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.northbound.dto.git.GitDto;
import com.jdddata.dockermgr.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitProjectController {

    @Autowired
    private GitService gitService;

    @PostMapping("/version")
    public ResultVo fetchBranches(@RequestBody GitDto gitDto) {

        return gitService.fetchBranches(gitDto.getUrl());
    }
}
