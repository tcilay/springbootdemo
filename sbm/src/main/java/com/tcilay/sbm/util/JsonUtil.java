package com.tcilay.sbm.util;

import com.alibaba.fastjson.JSON;

public class JsonUtil {

    /**
     * 将对象转换为JSON字符串
     */
    public static String toJson(Object obj){
        return JSON.toJSONString(obj);
    }
}
