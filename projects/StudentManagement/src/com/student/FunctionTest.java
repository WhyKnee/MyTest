package com.student;


import java.util.Comparator;
import java.util.TreeSet;

public class FunctionTest {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               int i=o1.length()-o2.length();
                return i==0?o1.compareTo(o2):i;
            }
        });
        ts.add("abb");
        ts.add("asbn");
        ts.add("qwer");
        for (String t : ts) {
            System.out.println(t);
        }
    }
}
