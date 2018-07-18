package com.jdddata.dockermgr.common;

public class DockerHttpContstants {

    /**
     * docker 创建容器
     */
    public static final String DOCKER_CONTAINER_CREATE = "https://{0}:2376/create?name={1}";

    /**
     * docker 获取节点上所有的容器包括停止的
     */
    public static final String DCOKER_CONTAINER_LIST_ALL = "https://{0}:2376/containers/json?all=true";

    /**
     * docker 获取正在运行的容器
     */
    public static final String DOCKER_CONTAINER_RUNNING = "https://{0}:2376/containers/json";

    /**
     * docker 获取指定容器
     */
    public static final String DOCKER_CONTAINER_FILTER = "https://{0}:2376/containers/json?filter=%7b%22name%22%3a%5b%22{1}%22%5d%7d";


}
