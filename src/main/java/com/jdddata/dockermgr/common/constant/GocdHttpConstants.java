package com.jdddata.dockermgr.common.constant;

import java.text.MessageFormat;

public class GocdHttpConstants {

    public static final String GOCD_SERVER = "192.168.136.158:8153";

    public static final String PIPELINE_CREATE = MessageFormat.format("http://{0}/go/api/admin/pipelines", GOCD_SERVER);
}
