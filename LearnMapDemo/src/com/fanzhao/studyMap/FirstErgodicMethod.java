package com.fanzhao.studyMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class FirstErgodicMethod {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("001","fanzhao");
        m.put("002","dongyukang");
        m.put("003","yanglixiang");
    //将集合中键值对的键取出来放进单列集合中
        Set<String> keys = m.keySet();
    //增强for遍历
        for (String key : keys) {
            System.out.print(key+"->");
            String value=m.get(key);
            System.out.println(value);
        }
    //lambda表达式遍历
        keys.forEach((String s)->{
                System.out.print(s+"->");
                System.out.println(m.get(s));
            }
        );
    //迭代器遍历
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.print(key+"->");
            System.out.println(m.get(key));
        }

    }
}
