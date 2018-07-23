package com.jdddata.dockermgr.vo;

import com.jdddata.dockermgr.common.util.httpclientutil.HttpResponse;
import org.apache.http.HttpStatus;

import java.util.Objects;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 15:44
 * @modified By:
 */
public class ResultGenerator {

    private static final String SUCCESS_CODE = "0";

    private static final String FAIL_CODE = "1";

    public static ResultVo getSuccess() {
        return new ResultVo(SUCCESS_CODE, null);
    }

    public static ResultVo getSuccess(String message) {
        return new ResultVo(SUCCESS_CODE, message);
    }

    public static ResultVo getFail() {
        return new ResultVo(FAIL_CODE, null);
    }

    public static ResultVo getFail(String message) {
        return new ResultVo(FAIL_CODE, message);

    }

    public static ResultVo getByDockerResponse(HttpResponse httpResponse) {
        if (Objects.isNull(httpResponse)) {
            return getFail("调用docker服务失败");
        }
        if (httpResponse.getStatusCode() < HttpStatus.SC_MULTIPLE_CHOICES) {
            return new ResultVo(SUCCESS_CODE, httpResponse.getBody());
        } else {
            return new ResultVo(FAIL_CODE, httpResponse.getBody());
        }

    }
}
