package com.jdddata.dockermgr.service;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/25 20:46
 * @modified By:
 */
public interface LoginService {

    /**
     * 登录验证接口
     * @param userName
     * @param password
     */
    void login(String userName,String password);
}
