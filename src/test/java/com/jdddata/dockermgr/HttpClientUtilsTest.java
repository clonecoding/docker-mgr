package com.jdddata.dockermgr;


import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpClientUtils;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpResponse;
import com.jdddata.dockermgr.adapter.gocd.common.HttpClientUtil;
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
        String url = "https://10.33.94.5:2376/containers/gezhiwei/start";
        HttpResponse message = HttpClientUtils.postWithCert(url,null);
    }
    @Test
    public void post3() throws Exception {
        String url = "https://192.168.136.158:8154/go/api/admin/pipelines/dac-maven";
        String message = HttpClientUtil.getWithHttps(url);
        System.out.println(message);
    }

}
