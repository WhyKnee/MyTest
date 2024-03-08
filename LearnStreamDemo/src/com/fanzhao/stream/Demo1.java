package com.fanzhao.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        //给集合中添加数据
        for(int i=1;i<=10;i++){
            arrayList.add(i);
        }
        Set<Integer> set = arrayList.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        }).collect(Collectors.toSet());
        System.out.println(set);
    }
}
