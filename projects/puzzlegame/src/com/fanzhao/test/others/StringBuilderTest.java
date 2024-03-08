package com.fanzhao.test.others;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringBuilderTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT:");
        String info=sc.next();
        char arr[] = new char[info.length()];
        for (int i = 0; i < info.length(); i++) {
            arr[i]=info.charAt(i);
        }
        String str=arrToString2(arr);
       // String str=arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(char arr[]){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else sb.append(arr[i]).append(",");
        }
        return sb.toString();
    }
    public static String arrToString2(char arr[]){
        StringJoiner sj=new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
           sj.add(String.valueOf(arr[i])).toString();
        }
        return sj.toString();
    }
}
