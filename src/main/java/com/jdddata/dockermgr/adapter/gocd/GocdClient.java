package com.jdddata.dockermgr.adapter.gocd;

import com.alibaba.fastjson.JSON;

import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpClientUtils;
import com.jdddata.dockermgr.adapter.gocd.dto.create.PipelineCreateDto;
import com.jdddata.dockermgr.common.constant.DockerHttpContstants;
import com.jdddata.dockermgr.common.constant.GocdHttpConstants;
import com.jdddata.dockermgr.common.util.HttpClientUtil;
import com.jdddata.dockermgr.service.impl.DockerContainerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class GocdClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(GocdClient.class);
    public static String createPipeline() {
        return null;
    }

    public static String getPipeLine(PipelineCreateDto pipelineCreateDto) {


        String url = MessageFormat.format(GocdHttpConstants.PIPELINE_GET, GocdHttpConstants.GOCD_SERVER, "dac-maven");

        String responseMessage = HttpClientUtil.getWithHttps(url);
        return responseMessage;
    }


}
