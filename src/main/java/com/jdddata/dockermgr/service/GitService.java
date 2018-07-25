package com.jdddata.dockermgr.service;

public interface GitService {
    String gitClone(String url, String version);

    void cleanGitPath(String codePath);
}
