package com.jdddata.dockermgr.docker;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
}
