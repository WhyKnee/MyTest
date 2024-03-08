package com.fanzhao.studyMap.TreeMapPracitce;

import java.util.Comparator;
import java.util.TreeMap;

public class PracticeDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        tm.put(1,"Cola");
        tm.put(3,"Cookie");
        tm.put(2,"Juice");
        System.out.println(tm);
    }
}
