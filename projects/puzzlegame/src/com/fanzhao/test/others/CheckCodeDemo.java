package com.fanzhao.test.others;

import java.util.Random;
import java.util.Scanner;

public class CheckCodeDemo {
    public static void main(String[] args) {

        //用户输入字符进行比对
        Scanner sc=new Scanner(System.in);
        while(true){
            String rightCode=toStringCode();
            System.out.print("请输入验证码:           ");
            System.out.println(rightCode);
            if(sc.next().equalsIgnoreCase(rightCode)){
                System.out.println("Correct!");
                break;
            }else{
                continue;
            }
        }
    }
    //循环生成多位验证码存储到字符数组中并转为字符串
    public static String toStringCode() {
        char[] codearray = new char[5];
        for (int i = 0; i < codearray.length; i++) {
            codearray[i] = generateCode();
        }
        String codestring = new String(codearray);
        return codestring;
    }
    //生成随机验证码
    public static char generateCode(){
       //根据随机生成的三个数字确定选择数字大小写字母
        Random random=new Random();
       int result=random.nextInt(3);
       switch (result){
           case 0:return generateNum();
           case 1:return generateUppercase();
           case 2:return generateLowercase();
           default:
               return generateCode();
       }



    }
    //生成随机数字
    public static char generateNum(){
        Random random=new Random();
        int num=random.nextInt(10)+48;
        return (char)num;
    }
    //生成随机大写字母
    public static char generateUppercase(){
        Random random=new Random();
        int uppercase=random.nextInt(26)+65;
        return (char) uppercase;
    }
    //生成随机小写字母
    public static char generateLowercase(){
        Random random=new Random();
        int lowercase=random.nextInt(26)+97;
        return (char) lowercase;
    }
}
