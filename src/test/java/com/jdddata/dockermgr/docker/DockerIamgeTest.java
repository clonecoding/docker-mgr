package com.jdddata.dockermgr.docker;

import com.jdddata.dockermgr.bussiness.service.DockerImageService;
import com.jdddata.dockermgr.bussiness.service.impl.DockerImageServiceImpl;
import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import org.junit.Test;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 11:08
 * @modified By:
 */
public class DockerIamgeTest {

    DockerImageService dockerImageService = new DockerImageServiceImpl();

    @Test
    public void List() {
        dockerImageService.list();
    }

    public String buildImage(String cmd) {
        return null;
    }

    @Test
    public void createIamge() {

        dockerImageService.createImage("redis", "4.0.5");

    }

    public String pushImage() {
        return null;
    }
}
