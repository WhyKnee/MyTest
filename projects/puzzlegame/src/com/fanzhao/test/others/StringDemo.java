package com.fanzhao.test.others;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your Phone Number：");
        String phone = sc.next();
        System.out.println(hintNum(phone));
    }

    private static String hintNum(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            if ((int) phone.charAt(i) <= 57 && (int) phone.charAt(i) >= 48) {
            }else return "请输入数字";
        }
        String startNum = phone.substring(0, 3);
        String endNum = phone.substring(phone.length() - 4);
        return startNum + "****" + endNum;

    }
}
