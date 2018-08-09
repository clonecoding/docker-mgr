package com.jdddata.dockermgr.common.util;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.*;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/9 11:13
 * @modified By:
 */
public class ThreadPoolUtils {

    private ThreadPoolUtils() {
    }

    private static final ExecutorService threadPool =new ScheduledThreadPoolExecutor(1,
            new BasicThreadFactory.Builder().namingPattern("docker-shedule-pool-%d").daemon(true).build());

    public static ExecutorService getThreadPool() {
        return threadPool;
    }



}
