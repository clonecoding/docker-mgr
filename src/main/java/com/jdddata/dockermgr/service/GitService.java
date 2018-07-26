package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.ResultVo;

public interface GitService {
    String gitClone(String url, String version);

    void cleanGitPath(String codePath);

    ResultVo fetchBranches(String url);
}
