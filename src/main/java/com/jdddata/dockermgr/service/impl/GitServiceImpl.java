package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.constant.GitConstants;
import com.jdddata.dockermgr.service.GitService;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.concurrent.TimeUnit;

@Service
public class GitServiceImpl implements GitService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GitServiceImpl.class);

    @Override
    public String gitClone(String url, String version) {
        try {
            String codePath = codePath(url);
            File f = new File(codePath);
            if (!f.exists()) {
                f.mkdirs();
            } else {
                deleteAll(f);
                TimeUnit.SECONDS.sleep(1);
                f.mkdirs();
            }
            CloneCommand cc = Git.cloneRepository().setURI(url).setBranch(version).setCredentialsProvider(new UsernamePasswordCredentialsProvider("gezhiwei", "12345678")).setTimeout(100000);
            Git git = cc.setDirectory(new File(codePath)).call();
            git.close();
            return codePath;
        } catch (InterruptedException e) {
            LOGGER.error("克隆项目失败：{}", url);
        } catch (InvalidRemoteException e) {
            LOGGER.error("克隆项目失败：{}", url);
        } catch (TransportException e) {
            LOGGER.error("克隆项目失败：{}", url);
        } catch (GitAPIException e) {
            LOGGER.error("克隆项目失败：{}", url);
        }
        return null;
    }

    @Override
    public void cleanGitPath(String codePath) {
        deleteAll(new File(codePath));
    }

    private String codePath(String url) {
        if (StringUtils.lowerCase(System.getProperty("os.name")).startsWith("win")) {
            return GitConstants.GIT_WORK_PATH_WIN + File.separator + url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("."));
        }

        if (StringUtils.lowerCase(System.getProperty("os.name")).startsWith("linux")) {
            return GitConstants.GIT_WORK_PATH_UNIX + File.separator + url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("."));
        }
        return null;
    }

    private synchronized void deleteAll(File file) {
        if (file.isDirectory()) { //如果是文件夹
            File[] files = file.listFiles();
            for (File file2 : files) {
                deleteAll(file2);
            }
        }
        file.delete(); //不管是不是文件夹都删除，当递归完，文件夹都会为空，都会被删除
    }
}
