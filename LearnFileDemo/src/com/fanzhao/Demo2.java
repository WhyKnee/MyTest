package com.fanzhao;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Demo2 {
    public static ArrayList<String> mp4List=new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("请输入盘符：");
        Scanner sc=new Scanner(System.in);
        String result=sc.nextLine();
        if(result.equals("C")||result.equals("D")||result.equals("E")){
            File src=new File(result+":\\");
            hasMp4(src);
            System.out.println("盘"+result+"中共有"+mp4List.size()+"个mp4文件");
        }


    }
    public static void hasMp4(File file) {
        System.out.println("正在查询>>>>>>>");
        ArrayList<String> arrayList = new ArrayList<>();
        File[] files = file.listFiles();

        if(files!=null){
        for (File f : files) {
            //是文件
            if (f.isFile()) {
                if (f.getName().endsWith(".mp4")) {
                    arrayList.add("***" + f.getAbsolutePath() + "***\n");
                }
            }
            //是目录
            else {
                hasMp4(f);
            }
        }
    }
        mp4List.addAll(arrayList);

    }






}
