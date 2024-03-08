package com.fanzhao.test.others;

import java.util.Random;
import java.util.Scanner;

public class DisorganizedString {

   static String str;

    public static void main(String[] args) {
        System.out.println("INPUT:");
        str=new Scanner(System.in).next();
        //调用随机处理方法并打印
        System.out.println("打乱后为:"+"\n"+disOrganized(str));
    }

    public static String disOrganized(String str){
        //将接受到的字符串转变为字符数组并存储
        char[] arrchar=str.toCharArray();
        //通过Random对象使字符数中与随机下标进行数据交换
        Random random=new Random();
        for (int i = 0; i < arrchar.length; i++) {
            char temp;
            int randomindex=random.nextInt(arrchar.length);
            temp=arrchar[i];
            arrchar[i]=arrchar[randomindex];
            arrchar[randomindex]=temp;
        }
        //将随机后的数组使用字符串存储并返回
        String result=new String(arrchar);
        return result;
    }

}
