package com.jdddata.dockermgr.jsch;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import com.jdddata.dockermgr.adapter.jcsh.SFTPUtil;
import com.jdddata.dockermgr.adapter.jcsh.SSHLinux;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class JschTest {

    private static final String DOCKER_RPM = "C:\\Users\\gezhiwei\\Downloads\\docker-ce-18.06.0.ce-3.el7.x86_64.rpm";
    private static final String DOCKER_RPM_name = "docker-ce-18.06.0.ce-3.el7.x86_64.rpm";


    public static void lscpu() throws IOException, JSchException {
        SSHLinux sshLinux = new SSHLinux("root", "1234", "10.33.94.60", 22);
        sshLinux.login();
        String lscpu = sshLinux.execCommand("lscpu");
        for (String line : lscpu.split("\n")) {
            if (line.startsWith("CPU(s)")) {
                char[] chars = line.trim().toCharArray();
                for (char aChar : chars) {
                    if (Character.isDigit(aChar)) {
                        System.out.println(aChar);
                    }
                }
            }
        }
        sshLinux.logout();
    }

    public static void freeh() throws IOException, JSchException {
        SSHLinux sshLinux = new SSHLinux("root", "1234", "10.33.94.60", 22);
        sshLinux.login();
        String mem = sshLinux.execCommand("free -h");
//        System.out.println(mem);
        StringBuffer stringBuffer = new StringBuffer();
        for (String line : mem.split("\n")) {
            if (line.startsWith("Mem")) {
                System.out.println(line);
                String trim = line.trim().substring(0, line.indexOf("G"));
                for (char c : trim.toCharArray()) {
                    if (Character.isDigit(c)) {
                        stringBuffer.append(c);
                    }
                    if (c == '.') {
                        stringBuffer.append(c);
                    }
                }
            }
        }
        System.out.println("mem is : " + stringBuffer.toString());

        sshLinux.logout();
    }

    public static void main(String[] args) throws IOException, JSchException, SftpException {
        freeh();
    }

    private static void oldTest() throws JSchException, IOException, SftpException {
        SSHLinux sshLinux = new SSHLinux("root", "1234", "10.33.94.58", 22);
        sshLinux.login();
        String javastatus = sshLinux.execCommand("rpm -qa | grep docker");
        if (StringUtils.isBlank(javastatus)) {
            System.out.println("server not install docker");
        }
        if (javastatus.trim().equalsIgnoreCase("docker-ce-18.06.0.ce-3.el7.x86_64")) {
            System.out.println("lihaile");
            sshLinux.execCommand("sudo yum remove -y docker docker-client docker-client-latest docker-common docker-latest docker-latest-logrotate docker-logrotate docker-selinux docker-engine-selinux docker-engine");
            sshLinux.logout();
            return;
        }
        sftpRpm();
        String dockerInstallStatus = sshLinux.execCommand("/usr/bin/yum install -y " + "/opt/install/docker/" + DOCKER_RPM_name);
        sshLinux.waitOn();
        String[] split = dockerInstallStatus.split("\\n");
        for (String ignored : split) {

        }
        System.out.println(dockerInstallStatus);
        sshLinux.logout();
    }

    private static void sftpRpm() throws FileNotFoundException, SftpException {
        SFTPUtil sftpUtil = new SFTPUtil("root", "1234", "10.33.94.58", 22);
        sftpUtil.login();
        Vector<ChannelSftp.LsEntry> objects = sftpUtil.listFiles("/opt/install/docker");
        for (ChannelSftp.LsEntry object : objects) {
            if (object.getFilename().equalsIgnoreCase(DOCKER_RPM_name)) {
                sftpUtil.logout();
                return;
            }
        }
        sftpUtil.upload("/opt/install/docker", DOCKER_RPM);
        sftpUtil.logout();
    }
}
