package com.jdddata.dockermgr.adapter.jcsh;


import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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

    public String execCommand(String command) throws JSchException, IOException {
        ChannelExec channel = (ChannelExec) session.openChannel("exec");
        channel.setCommand(command + "\n");
        OutputStream out=channel.getOutputStream();
        //channel.setInputStream(null);
        channel.setErrStream(System.err);
        channel.connect();
        InputStream in = channel.getInputStream();
        StringBuffer stringBuffer = new StringBuffer();
        byte[] tmp=new byte[1024];
        while(true){
            while(in.available()>0){
                int i=in.read(tmp, 0, 1024);
                if(i<0)break;
                stringBuffer.append(new String(tmp, 0, i));
            }
            if(channel.isClosed()){
                break;
            }
            try{Thread.sleep(1000);}catch(Exception ee){ee.printStackTrace();}
        }
        return stringBuffer.toString();
    }

    public String shellCommand(String commad) {
        return null;
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

    public void waitOn() {

    }
}
