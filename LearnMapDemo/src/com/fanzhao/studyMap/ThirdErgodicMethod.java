package com.fanzhao.studyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ThirdErgodicMethod {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("001","fanzhao");
        map.put("002","dongyk");
        map.put("003","yanglx");

        map.forEach((String key, String value)-> System.out.println(key+"->"+value));
    }
}
