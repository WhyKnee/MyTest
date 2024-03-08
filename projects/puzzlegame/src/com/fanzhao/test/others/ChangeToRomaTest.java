package com.fanzhao.test.others;

import java.util.Scanner;

public class ChangeToRomaTest {
    public static int romaIndex;//用来存储转换索引
    public static void main(String[] args) {
        //直到录入正确为止
        while(true){
            String info=inputInfo();
            if(isNum(info)){
                //若正确，则开始转换
                StringBuilder sb=new StringBuilder();
                for (int i = 0; i < info.length(); i++) {
                    romaIndex=Integer.parseInt(String.valueOf(info.charAt(i)));
                    sb.append(toRoma(romaIndex));
                }
                System.out.println(sb.toString());
                break;
            }
            else System.out.println("请输入纯数字！");
        }

    }
    //录入数据
    public static String inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT:");
        String input=sc.next();
        return input;
    }
    //判断录入数据是否为纯数字
    public static Boolean isNum(String input){
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)<'0'||input.charAt(i)>'9')
                return false;
        }
        return true;
    }
    //转换为罗马数字
    public static String toRoma(int index){
        //罗马数字表
        String []roma={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ", "Ⅶ","Ⅷ","Ⅸ"};
        return roma[index];
    }
}
