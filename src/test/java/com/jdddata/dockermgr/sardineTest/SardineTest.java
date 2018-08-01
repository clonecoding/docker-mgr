package com.jdddata.dockermgr.sardineTest;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SardineTest {

    public void test() throws IOException {
        Sardine sardine = SardineFactory.begin();
        boolean exists = sardine.exists("http://192.168.136.159:8080/dockerfile/默认/Dockerfile");
        System.out.println(true);
    }

    public void test1() throws IOException {
        Sardine sardine = SardineFactory.begin();
        List<DavResource> list = sardine.list("http://192.168.136.159:8080");

        for (DavResource davResource : list) {
            System.out.println(davResource.getPath());
        }
    }

    public void test2() throws IOException {
        Sardine sardine = SardineFactory.begin();
        sardine.put("http://192.168.136.159:8080/dockerfile/默认/Dockerfile", new FileInputStream(new File("C:\\Users\\gezhiwei\\Desktop\\dockerfile\\dac\\Dockerfile")));
    }

    public void test3() throws IOException {
        Sardine sardine = SardineFactory.begin();
        InputStream inputStream = sardine.get("http://192.168.136.159:8080/dockerfile/默认/Dockerfile");
        List<String> strings = IOUtils.readLines(inputStream, "utf-8");
        strings.forEach(s-> System.out.println(s));
    }

    public static void main(String[] args) throws IOException {
        SardineTest sardineTest = new SardineTest();
        sardineTest.test3();
    }
}
