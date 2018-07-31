package com.jdddata.dockermgr.northbound.dto.server;

import com.jdddata.dockermgr.common.util.CryptoUtil;
import com.jdddata.dockermgr.dao.entity.ServerMgr;

import java.util.Date;

public class ServerInfoDto {

    /**
     * 生产、测试
     */
    private String typeName;
    /**
     * 基础组
     * 加工组
     * 接口组
     * 中间件
     * 公共组
     */
    private String belong;

    private String ip;

    private int port;

    private String username;

    private String password;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ServerMgr convert() {
        ServerMgr serverMgr = new ServerMgr();
        serverMgr.setTypename(typeName);
        serverMgr.setAddtime(new Date());
        serverMgr.setBelong(this.belong);
        serverMgr.setIp(this.ip);
        serverMgr.setPort(this.port);
        serverMgr.setUsername(this.username);
        serverMgr.setPassword(CryptoUtil.encrypt(this.password));
        return serverMgr;
    }
}
