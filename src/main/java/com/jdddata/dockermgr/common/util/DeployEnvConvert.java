package com.jdddata.dockermgr.common.util;

public class DeployEnvConvert {

    public static String toStr(Integer deployEnv) {
        return deployEnv.intValue() == 0 ? "test" : "prod";
    }
}
