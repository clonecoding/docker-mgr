package com.jdddata.dockermgr.common.util;

public class DeployEnvConvert {

    /**
     * 用于转换部署环境是测试还是prod
     *
     * @param deployEnv
     * @return
     */
    public static String toStr(Integer deployEnv) {
        return deployEnv.intValue() == 0 ? "test" : "prod";
    }


    /**
     * 从 docker-registry/jdddata.com/dac-schedule中取出dac-schedule
     *
     * @param dockerImageName
     * @return
     */
    public static String fetchAttrNameFromImage(String dockerImageName) {
        return dockerImageName.substring(dockerImageName.lastIndexOf("/") + 1);
    }
}
