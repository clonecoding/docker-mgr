package com.jdddata.dockermgr.common.constant;

import java.io.File;

public class GitConstants {
    /**
     * git windows 下的工作目录
     */
    public static final String GIT_WORK_PATH_WIN = "C:" + File.separator + "CODE_GIT";

    /**
     * git unix下的工作目录
     */
    public static final String GIT_WORK_PATH_UNIX = "/data/code_git";

    /**
     * maven nexus请求下载的api
     */
    public static final String MAVEN_NEXUS = "http://maven-repository.jdddata.com/nexus/service/local/artifact/maven/redirect?r=public&g={0}&a={1}&v={2}&c=install&p=tar.gz";

}
