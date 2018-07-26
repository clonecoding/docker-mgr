package com.jdddata.dockermgr.docker;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


import static com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/18 18:40
 * @modified By:
 */
public class FastJsonTest {

    @Test
    public void test(){
        Map<String,Object> map =  new HashMap<>();
        map.put("123",new Object());
        System.out.println(JSON.toJSONString(map, WriteMapNullValue));
    }

    @Test
    public void test2() throws DocumentException {
        SAXReader reader=new SAXReader();
        //读取xml文件到Document中
        Document doc=reader.read("E:\\ideaProject\\docker-mgr\\pom.xml");
        //获取xml文件的根节点
        Element rootElement=doc.getRootElement();
        System.out.println(rootElement.elementTextTrim("modelVersion"));

    }

}
