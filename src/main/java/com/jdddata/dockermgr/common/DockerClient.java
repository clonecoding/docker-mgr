package com.jdddata.dockermgr.common;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import com.jdddata.dockermgr.vo.ResultGenerator;
import com.jdddata.dockermgr.vo.ResultVo;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
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

    public static HttpResponse pruneImage(String filters, String serverInfo) {
        Map<String, String> map = new HashMap<>();
        map.put("filters", filters);
        return HttpClientUtils.postWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_PRUNE, serverInfo),null);

    }

}
