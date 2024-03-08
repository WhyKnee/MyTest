package com.fanzhao.test.others;

import java.util.Scanner;

public class RotateStringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT:");
        String str=sc.next();
        String origin=str;
        while(true){
            if(rotate(str).equals(origin)) {
                System.out.println(rotate(str));
                System.out.println("loop!");
                break;
            }else{
                str=rotate(str);
                System.out.println(str);
            }
        }
    }

    public static String rotate(String str){
        //确定要旋转的字符
        String strStart=str.substring(0,1);
        String strEnd=str.substring(1);
        StringBuilder sb=new StringBuilder();
        String result=sb.append(strEnd).append(strStart).toString();
        return result;

    }
}
