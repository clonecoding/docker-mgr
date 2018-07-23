package com.jdddata.dockermgr.adapter.jcsh;


import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class SSHLinux {


    private transient Logger log = LoggerFactory.getLogger(this.getClass());

    private ChannelExec channelExec;

    private Session session;
    /**
     * FTP 登录用户名
     */
    private String username;
    /**
     * FTP 登录密码
     */
    private String password;
    /**
     * 私钥
     */
    private String privateKey;
    /**
     * FTP 服务器地址IP地址
     */
    private String host;
    /**
     * FTP 端口
     */
    private int port;

    public SSHLinux(String user, String password, String host, int port) {
        this.username = user;
        this.password = password;
        this.host = host;
        this.port = port;
    }


    public void login() {
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(username, host, port);
            session.setConfig("StrictHostKeyChecking", "no");

            session.setPassword(password);
            session.connect();
            this.session = session;
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }

    public String exeCommand(String command) throws JSchException, IOException {
        channelExec = (ChannelExec) session.openChannel("exec");
        InputStream in = channelExec.getInputStream();
        channelExec.setCommand(command);
        channelExec.setErrStream(System.err);
        channelExec.connect();
        String out = IOUtils.toString(in, "UTF-8");
        channelExec.disconnect();
        return out;
    }

    public void logout() {
        if (null != channelExec) {
            channelExec.disconnect();
        }
        if (null != session) {
            if (session.isConnected()) {
                session.disconnect();
            }
        }
    }
}
