package com.jdddata.dockermgr.common;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import org.springframework.http.HttpStatus;

import java.text.MessageFormat;

public final class DockerClient {


    public static String createContainer(String serverInfo, String name, ContainerCreateDto containerCreateDto) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_CREATE, serverInfo, name);
        HttpResponse response = HttpClientUtils.postRawWithCert(url, JSON.toJSONString(containerCreateDto));
        if (null == response) {
            return null;
        }
        
        return null;
    }

    public static Boolean containerNameExist(String serverInfo, String name) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_FILTER, serverInfo, name);
        HttpResponse response = HttpClientUtils.getWithCert(url);
        if (null == response) {
            return null;
        }
        return response.getStatusCode() == HttpStatus.OK.value();
    }


}
