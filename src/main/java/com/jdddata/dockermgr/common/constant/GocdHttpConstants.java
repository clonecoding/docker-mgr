package com.jdddata.dockermgr.common.constant;

public class GocdHttpConstants {

    public static final String GOCD_SERVER = "http://192.168.136.158:8154";

    public static final String PIPELINE_CREATE = GOCD_SERVER + "/go/api/admin/pipelines";

    public static final String PIPELINE_GET = GOCD_SERVER + "/go/api/admin/pipelines/{0}";
}
