package com.fanzhao.test.others;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        int uppercase=0;
        int lowercase=0;
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符:");
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
           //是数字
            if((int)str.charAt(i)<=57&&(int)str.charAt(i)>=48){
                num++;
            }
            //是大写字母
            if((int)str.charAt(i)<=90&&(int)str.charAt(i)>=65){
                uppercase++;
            }
            //是小写字母
            if((int)str.charAt(i)<=122&&(int)str.charAt(i)>=97){
                lowercase++;
            }
        }
        System.out.println("有数字"+num+"\n小写字母"+lowercase+"\n大写字母"+uppercase);
    }
}
