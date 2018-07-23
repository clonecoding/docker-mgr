package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.service.DockerImageService;
import com.jdddata.dockermgr.adapter.docker.DockerClient;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpResponse;
import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 9:42
 * @modified By:
 */
@Service
public class DockerImageServiceImpl implements DockerImageService {

    @Override
    public ResultVo list(String serverInfo) {
        HttpResponse httpResponse = DockerClient.listImage(serverInfo);
        return ResultGenerator.getByDockerResponse(httpResponse);
    }

    @Override
    public ResultVo buildImage(String serverInfo, String cmd) {
        return null;
    }

    @Override
    public ResultVo createImage(String serverInfo, String fromImage, String tag) {
        if (StringUtils.isEmpty(fromImage)) {
            return ResultGenerator.getFail("参数不能为空");
        }
        HttpResponse httpResponse = DockerClient.createImage(fromImage, tag, serverInfo);
        return ResultGenerator.getByDockerResponse(httpResponse);
    }

    @Override
    public ResultVo pushImage(String serverInfo) {
        return null;
    }

    @Override
    public ResultVo removeImage(String serverInfo, String imageNameOrId) {
        if (StringUtils.isEmpty(imageNameOrId)) {
            return ResultGenerator.getFail("参数不能为空");
        }
        HttpResponse httpResponse = DockerClient.removeImage(imageNameOrId, serverInfo);
        return ResultGenerator.getByDockerResponse(httpResponse);
    }

    @Override
    public ResultVo pruneImage(String serverInfo, String filters) {
        if (StringUtils.isEmpty(filters)) {
            return ResultGenerator.getFail("参数不能为空");
        }
        HttpResponse httpResponse = DockerClient.pruneImage(filters, serverInfo);
        return ResultGenerator.getByDockerResponse(httpResponse);
    }
}
