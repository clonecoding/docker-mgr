package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.git.GitDto;

public interface PomParseService {

    ResultVo parseFromGit(GitDto gitDto);
}
