package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.common.exception.DockerApiReqException;
import com.jdddata.dockermgr.vo.ResultVo;

import java.util.List;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 10:36
 * @modified By:
 */
public interface DockerImageService {

    ResultVo list(String serverInfo);

    ResultVo buildImage(String serverInfo,String cmd);

    ResultVo createImage(String serverInfo,String fromImage, String tag);

    ResultVo pushImage(String serverInfo);

    ResultVo removeImage(String serverInfo,String imageNameOrId);

    ResultVo pruneImage(String serverInfo,String filters);
}
