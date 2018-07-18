package com.jdddata.dockermgr.bussiness.service.impl;

import com.jdddata.dockermgr.bussiness.service.DockerImageService;
import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 9:42
 * @modified By:
 */
@Service
public class DockerImageServiceImpl implements DockerImageService {

    private String url = "https://10.33.94.5:2376";

    @Override
    public String List() {

        HttpResponse httpResponse = HttpClientUtils.getWithCert(url + DockerImageService.LIST_URL);
        return null;
    }

    @Override
    public String buildImage(String cmd) {
        return null;
    }

    @Override
    public String createImage(String fromImage, String tag) throws DockerApiReqException {
        String createUrl = url + DockerImageService.CREATE_IMAGE;
        Map<String, Object> param = new HashMap<>();
        if (StringUtils.isEmpty(fromImage)) {
            throw new DockerApiReqException("参数不合法");
        }
        param.put("fromImage", fromImage);
        if (!StringUtils.isEmpty(tag)) {
            param.put("tag", tag);
        }

        HttpResponse httpResponse = HttpClientUtils.postWithCert(createUrl, param);
        return httpResponse.getBody();
    }

    @Override
    public String pushImage() {
        return null;
    }
}
