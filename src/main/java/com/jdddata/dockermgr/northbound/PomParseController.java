package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.git.GitDto;
import com.jdddata.dockermgr.service.GitService;
import com.jdddata.dockermgr.service.PomParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pom")
public class PomParseController {

    @Autowired
    private GitService gitService;

    @Autowired
    private PomParseService pomParseService;

    @PostMapping("/xml")
    public ResultVo parse(@RequestBody GitDto gitDto){
        checkGitUrl(gitDto.getUrl());
        return pomParseService.parseFromGit(gitDto);
    }

    private void checkGitUrl(String url) {
    }
}
