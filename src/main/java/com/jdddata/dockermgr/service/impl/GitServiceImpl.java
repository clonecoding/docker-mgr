package com.jdddata.dockermgr.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jdddata.dockermgr.common.constant.GitConstants;
import com.jdddata.dockermgr.common.vo.gitlab.Branch;
import com.jdddata.dockermgr.common.util.NHttpClient;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.service.GitService;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Service
public class GitServiceImpl implements GitService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GitServiceImpl.class);
    private static final String GIT_URL_PRIFEX = "https://gitlab.jdddata.com/";
    //https://gitlab.jdddata.com/api/v4/projects/zhuenjun%2FDPC-logic-odds/repository/branches
    private static final String BRANCH_URL = "https://gitlab.jdddata.com/api/v4/projects/{0}/repository/branches";
    private static final String TAG_URL = "https://gitlab.jdddata.com/api/v4/projects/{0}/repository/tags";
    private static final String DEFAULTCHARSET = "UTF-8";


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

    @Override
    public ResultVo fetchBranches(String url) {
        try {
            //gezhiwei/docker-mgr.git
            String trim1 = url.replace(GIT_URL_PRIFEX, "").trim();
            String str2 = trim1.replaceAll("/", "%2F").replace(".git", "");
            String bformat = MessageFormat.format(BRANCH_URL, str2);
            String tformat = MessageFormat.format(TAG_URL, str2);
            String branchstr = null;
            String tagStr = null;

            branchstr = getBranchStr(bformat, branchstr);
            tagStr = getBranchStr(tformat, tagStr);


            Map<String, List<String>> stringListMap = new ConcurrentHashMap<>();
            stringListMap.put("branch", convert(JSONObject.parseArray(branchstr, Branch.class)));
            stringListMap.put("tag", convert(JSONObject.parseArray(tagStr, Branch.class)));
            stringListMap.put("url", Arrays.asList(url));
            return ResultGenerator.getSuccessDto(stringListMap);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultGenerator.getFail("getVersion Failed");
    }

    private List<String> convert(List<Branch> branches) {
        List<String> list = new ArrayList<>();
        for (Branch branch : branches) {
            list.add(branch.getName());
        }
        return list;
    }

    private String getBranchStr(String format, String branchstr) throws ExecutionException, InterruptedException, IOException {
        Future<HttpResponse> httpResponseFuture = NHttpClient.httpGet(format);
        HttpResponse resp = httpResponseFuture.get();
        HttpEntity entity = resp.getEntity();
        if (entity != null) {
            final InputStream instream = entity.getContent();
            try {
                final StringBuilder sb = new StringBuilder();
                final char[] tmp = new char[1024];
                final Reader reader = new InputStreamReader(instream, DEFAULTCHARSET);
                int l;
                while ((l = reader.read(tmp)) != -1) {
                    sb.append(tmp, 0, l);
                }
                branchstr = sb.toString();
            } finally {
                instream.close();
                EntityUtils.consume(entity);
            }
        }
        return branchstr;
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
