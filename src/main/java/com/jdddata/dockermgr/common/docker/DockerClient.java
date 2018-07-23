package com.jdddata.dockermgr.common.docker;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.bussiness.service.bo.container.list.ContainerListDto;
import com.jdddata.dockermgr.bussiness.service.impl.DockerContainerServiceImpl;
import com.jdddata.dockermgr.common.util.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.util.httpclientutil.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
public final class DockerClient {


    private static final Logger LOGGER = LoggerFactory.getLogger(DockerContainerServiceImpl.class);

    public static HttpResponse createContainer(String serverInfo, String name, ContainerCreateDto containerCreateDto) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_CREATE, serverInfo, name);
        String json = JSON.toJSONString(containerCreateDto);
        LOGGER.info("#containerNameExist url: {},json: {}", url, json);
        return HttpClientUtils.postRawWithCert(url, json);
    }

    public static Boolean containerNameExist(String serverInfo, String name) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_FILTER, serverInfo, name);
        LOGGER.info("#containerNameExist url: {}", url);
        HttpResponse response = HttpClientUtils.getWithCert(url);
        if (null == response) {
            return false;
        }
        return response.getStatusCode() == HttpStatus.OK.value();
    }

    public static HttpResponse listContainers() {
        return HttpClientUtils.getWithCert(DockerHttpContstants.DCOKER_CONTAINER_LIST_ALL);
    }

        public static HttpResponse startContainer(String serverInfo, String name) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_START, serverInfo, name);
        return HttpClientUtils.postWithCert(url, null);
    }

    public static HttpResponse stopContainer(String serverInfo, String name) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_STOP, serverInfo, name);
        return HttpClientUtils.postWithCert(url, null);
    }

    public static HttpResponse deleteContainer(String serverInfo, String name) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_DELETE, serverInfo, name);
        LOGGER.info("#deleteContainer url: {}", url);
        return HttpClientUtils.deleteWithCert(url);
    }

    public static HttpResponse getSpecContainer(String serverInfo, String name) {
        String url = MessageFormat.format(DockerHttpContstants.DOCKER_CONTAINER_FILTER, serverInfo, name);
        return HttpClientUtils.getWithCert(url);
    }

    /**
     * 创建Images
     *
     * @param fromImage
     * @param tag
     * @param serverInfo
     * @return
     */
    public static HttpResponse createImage(String fromImage, String tag, String serverInfo) {
        Map<String, Object> param = new HashMap<>();
        if (!StringUtils.isEmpty(fromImage)) {
            param.put("fromImage", fromImage);
        }
        if (!StringUtils.isEmpty(tag)) {
            param.put("tag", tag);
        }
        return HttpClientUtils.postWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_CREATE, serverInfo), param);

    }

    /**
     * @param imageNameOrId
     * @param serverInfo
     * @return
     * @author zhangheng(赛事)
     * @description 删除 image
     */
    public static HttpResponse removeImage(String imageNameOrId, String serverInfo) {
        HttpResponse httpResponse = HttpClientUtils.deleteWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE + imageNameOrId, serverInfo));
        return httpResponse;
    }

    /**
     * @return
     * @author zhangheng(赛事)
     * @description image List
     */
    public static HttpResponse listImage(String serverInfo) {
        HttpResponse httpResponse = HttpClientUtils.getWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_LIST, serverInfo));
        return httpResponse;
    }

    /**
     * @return
     * @author zhangheng(赛事)
     * @description 判断image是否存在
     */
    public static boolean imageNameOrIdExist(String serverInfo, String imageNameOrId) {
        HttpResponse httpResponse = HttpClientUtils.getWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_INSPECT, serverInfo, imageNameOrId));
        if (Objects.equals(HttpStatus.OK.value(), httpResponse.getStatusCode())) {
            return true;
        } else {
            return false;
        }
    }

    public static HttpResponse pruneImage(String filters, String serverInfo) {
        Map<String, String> map = new HashMap<>();
        map.put("filters", filters);
        return HttpClientUtils.postWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_PRUNE, serverInfo), null);

    }


}
