package com.student.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class StrengthFor {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
//        for (String s : list) {
//            System.out.println(s);
//        }
        list.forEach((String s)-> System.out.println(s));
    }

}
