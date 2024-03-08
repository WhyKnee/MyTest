package com.fanzhao.studyMap.TreeMapPracitce;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class PracticeDemo3 {

    public static void main(String[] args) {
        System.out.print("输入要判断的字符:");
        String s=new Scanner(System.in).next();
        TreeMap<Character,Integer> tmp=new TreeMap<>();
        //拿到每一个字符并作为key放入TreeMap中
        for (int i = 0; i < s.length(); i++) {
            //判断是否为第一次出现
            if(tmp.containsKey(s.charAt(i))){
                //不是第一次出现
                int count=tmp.get(s.charAt(i));
                tmp.replace(s.charAt(i),++count);
            }else{
                //第一次出现
                tmp.put(s.charAt(i),1);
            }
        }
        StringBuilder sb=new StringBuilder();
        tmp.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);
    }
}
