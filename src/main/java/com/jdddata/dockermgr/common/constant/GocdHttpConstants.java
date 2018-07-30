package com.jdddata.dockermgr.common.constant;

import java.text.MessageFormat;

public class GocdHttpConstants {

    public static final String GOCD_SERVER = "192.168.136.158:8154";

    public static final String PIPELINE_CREATE = MessageFormat.format("http://{0}/go/api/admin/pipelines", GOCD_SERVER);

    public static final String PIPELINE_GET = MessageFormat.format("https://{0}/go/api/admin/pipelines/{1}", GOCD_SERVER);
}
