package com.jdddata.dockermgr.sardineTest;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

    public static void main(String[] args) throws IOException {
        SardineTest sardineTest = new SardineTest();
        sardineTest.test();
    }
}
