package com.jdddata.dockermgr.docker;

import com.jdddata.dockermgr.service.DockerImageService;
import com.jdddata.dockermgr.service.impl.DockerImageServiceImpl;
import com.jdddata.dockermgr.adapter.docker.DockerClient;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpResponse;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import org.junit.Test;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 11:08
 * @modified By:
 */
public class DockerIamgeTest {

    private String ip = "10.33.94.5";

    DockerImageService dockerImageService = new DockerImageServiceImpl();

    @Test
    public void List() {
        dockerImageService.list(ip);
    }

    public String buildImage(String cmd) {
        return null;
    }

    @Test
    public void createIamge() {

     ResultVo resultVo = dockerImageService.createImage(ip, "docker-registry.jdddata.com/jdddata/dac-schedule:test-1.0.0", "4.0.5");

    }

    @Test
    public void imageNameOrIdExist() {

        boolean flag = DockerClient.imageNameOrIdExist(ip, "docker-registry.jdddata.com/jdddata/docker-mgr:test-master");
        System.out.println(flag);
    }

    @Test
    public void removeImage() {

        HttpResponse httpResponse =
                DockerClient.removeImage("docker-registry.jdddata.com/jdddata/dac-schedule:test-1.0.0",ip);
        System.out.println(httpResponse.getBody());
    }

    public String pushImage() {
        return null;
    }
}
