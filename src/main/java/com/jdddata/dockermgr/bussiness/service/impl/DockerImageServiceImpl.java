package com.jdddata.dockermgr.bussiness.service.impl;

import com.jdddata.dockermgr.bussiness.service.DockerImageService;
import com.jdddata.dockermgr.common.DockerHttpContstants;
import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import com.jdddata.dockermgr.vo.ResultGenerator;
import com.jdddata.dockermgr.vo.ResultVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.MessageFormat;
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

    private String IP = "10.33.94.5";

    @Override
    public ResultVo list() {
        HttpResponse httpResponse = HttpClientUtils.getWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_LIST, IP));
        return ResultGenerator.getByDockerResponse(httpResponse);
    }

    @Override
    public ResultVo buildImage(String cmd) {
        return null;
    }

    @Override
    public ResultVo createImage(String fromImage, String tag) {
        Map<String, Object> param = new HashMap<>();
        if (StringUtils.isEmpty(fromImage)) {
            return ResultGenerator.getFail("参数不能为空");
        }
        param.put("fromImage", fromImage);
        if (!StringUtils.isEmpty(tag)) {
            param.put("tag", tag);
        }
        HttpResponse httpResponse = HttpClientUtils.postWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE_CREATE, IP), param);
        return ResultGenerator.getByDockerResponse(httpResponse);
    }

    @Override
    public ResultVo pushImage() {
        return null;
    }

    @Override
    public ResultVo removeImage(String imageNameOrId) {
        if (StringUtils.isEmpty(imageNameOrId)) {
            return ResultGenerator.getFail("参数不能为空");
        }
        HttpResponse httpResponse = HttpClientUtils.deleteWithCert(
                MessageFormat.format(DockerHttpContstants.DOCKER_IMAGE + imageNameOrId, IP));
        return ResultGenerator.getByDockerResponse(httpResponse);

    }
}
