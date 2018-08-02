package com.jdddata.dockermgr.adapter.webdav;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: zhangheng(赛事)
 * @Description: 文件上传工具
 * @Date: 2018/8/2 16:49
 * @modified By:
 */
public class WebDavClient {

    public static boolean existFile(String filePath) throws IOException {
        Sardine sardine = SardineFactory.begin();
        return sardine.exists(filePath);
    }

    /**
     * @param path
     * @return
     * @throws IOException
     * @author zhangheng(赛事)
     * @description 获取当前路径下的所有文件
     */
    public static List<String> getAllFile(String path) throws IOException {
        Sardine sardine = SardineFactory.begin();
        List<String> files = null;
        List<DavResource> list = sardine.list(path);
        if (Objects.nonNull(list)) {
            files = new ArrayList<>();
            for (DavResource davResource : list) {
                files.add(davResource.getPath());
            }
        }
        return files;
    }

    public static void uploadDockerFile(String fileName,InputStream inputStream ) throws IOException{
        Sardine sardine = SardineFactory.begin();
        sardine.put(fileName, inputStream);

    }

}
