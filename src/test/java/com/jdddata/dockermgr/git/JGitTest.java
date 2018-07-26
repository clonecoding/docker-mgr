package com.jdddata.dockermgr.git;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;

public class JGitTest {

    public static String cloneRepository(String url, String localPath) {
        try {
            System.out.println("开始下载......");

            CloneCommand cc = Git.cloneRepository().setURI(url).setBranch("1.0.0").setCredentialsProvider(new UsernamePasswordCredentialsProvider("gezhiwei", "12345678")).setTimeout(100000);
            cc.setDirectory(new File(localPath)).call();
            System.out.println("下载完成......");



            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    public static void main(String[] args) {
//        String localPath = "E:\\TEST_JGIT";
//        String url = "https://gitlab.jdddata.com/project/dac/dac.git";
//
//        cloneRepository(url, localPath);
        System.out.println(System.getProperty("os.name"));

    }
}
