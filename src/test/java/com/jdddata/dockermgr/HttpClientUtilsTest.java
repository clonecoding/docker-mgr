package com.jdddata.dockermgr;


import com.jdddata.dockermgr.common.httpclientutil.HttpClientUtils;
import com.jdddata.dockermgr.common.httpclientutil.HttpResponse;
import org.junit.Test;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 16:32
 * @modified By:
 */
public class HttpClientUtilsTest {
    String url = "https://github.com/Arronlong/httpclientutil";

    @Test
    public void post2() throws Exception {
        String url = "https://10.33.94.5:2376/containers/json?all=1";
        HttpResponse message = HttpClientUtils.getWithCert(url, "E:\\ideaProject\\docker-mgr\\build\\config\\cert");

        System.out.println(message);
    }

}
