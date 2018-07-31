package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.response.ResultVo;

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
