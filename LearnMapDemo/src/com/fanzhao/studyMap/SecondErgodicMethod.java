package com.fanzhao.studyMap;

import java.util.*;
import java.util.function.Consumer;

public class SecondErgodicMethod {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("001","fanzhao");
        map.put("002","dongyuk");
        map.put("003","yanglix");

        //将集合中的键值对放入set集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //遍历set集合

        //增强for
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        //迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> result = it.next();
            System.out.println(result.getKey()+"->"+result.getValue());
        }
        //lambda表达式
        entries.forEach((Map.Entry<String, String> entry)->{
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }
        );

    }
}
