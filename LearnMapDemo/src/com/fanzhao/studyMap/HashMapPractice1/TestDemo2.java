package com.fanzhao.studyMap.HashMapPractice1;

import com.sun.jdi.IntegerValue;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

public class TestDemo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Input address");
            String address=sc.next();
            if(address.equals("exit")) break;
            int time;
            if (!hm.containsKey(address)) {
                time=1;
                hm.put(address, time);
            } else {
                hm.replace(address, hm.get(address)+1);
            }
            hm.forEach(new BiConsumer<String, Integer>() {
                @Override
                public void accept(String s, Integer integer) {
                    System.out.println("景点"+s+":总计"+integer+"次");
                }
            });
        }
    }
}
