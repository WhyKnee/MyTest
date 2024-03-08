package com.fanzhao.test.others;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static ArrayList<Account> arrayList=new ArrayList<>();

    public static void main(String[] args) {
        //向集合中添加数据
        arrayList.add(new Account("001","Jack","123456"));
        arrayList.add(new Account("002","Bob","123123"));
        arrayList.add(new Account("003","Judy","133509"));
        //通过键盘录入要查询的UID
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的UID:");
        String UID=sc.next();
        //调用查询方法
        searchInfo(UID);
    }
    //根据ID查找对应的用户信息
    public static boolean searchInfo(String UID){
        for (int i = 0; i < arrayList.size(); i++) {
            //用获取到的UID与集合中的进行遍历比对
            if(UID.equals(arrayList.get(i).getUID())){
                System.out.println(arrayList.get(i));
                return true;
            }else continue;
        }
        System.out.println("未查询到对象！");
        return false;
    }
}
