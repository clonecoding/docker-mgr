package com.jdddata.dockermgr.common.util;

public class DigitUtil {

    public static boolean isDigit(String string) {
        boolean flag = true;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (!Character.isDigit(aChar)) {
                flag = false;
            }
        }
        return flag;
    }
}
