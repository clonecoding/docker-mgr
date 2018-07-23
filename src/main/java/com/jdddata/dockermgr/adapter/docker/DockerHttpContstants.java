package com.jdddata.dockermgr.adapter.docker;

public class DockerHttpContstants {

    /**
     * docker 创建容器
     */
    public static final String DOCKER_CONTAINER_CREATE = "https://{0}:2376/containers/create?name={1}";

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
    public static final String DOCKER_CONTAINER_FILTER = "https://{0}:2376/containers/json?filter=\\{\"name\":[\"{1}\"]\\}";

    /**
     * docker start container
     */
    public static final String DOCKER_CONTAINER_START = "https://{0}:2376/containers/{1}/start";

    /**
     * docker stop container
     */
    public static final String DOCKER_CONTAINER_STOP = "https://{0}:2376/containers/{1}/stop";

    /**
     * 删除一个container
     */
    public static final String DOCKER_CONTAINER_DELETE = "https://{0}:2376/containers/{1}";

    /**
     * @author zhangheng(赛事)
     * @description docker image 接口
     */
    public static final String DOCKER_IMAGE = "https://{0}:2376/images/";
    /**
     * @author zhangheng(赛事)
     * @description docker image 列表
     */
    public static final String DOCKER_IMAGE_LIST = "https://{0}:2376/images/json";

    /**
     * @author zhangheng(赛事)
     * @description docker image 创建
     */
    public static final String DOCKER_IMAGE_CREATE = "https://{0}:2376/images/create";

    /**
     * @author zhangheng(赛事)
     * @description docker image psuh
     */
    public static final String DOCKER_IMAGE_PUSH = "https://{0}:2376/images/{1}/push";

    /**
     * @author zhangheng(赛事)
     * @description 删除无效的 iamge
     */
    public static final String DOCKER_IMAGE_PRUNE = "https://{0}:2376/images/prune";

    /**
     * @author zhangheng(赛事)
     * @description 删除无效的 iamge
     */
    public static final String DOCKER_IMAGE_INSPECT = "https://{0}:2376/images/{1}/json";

}
