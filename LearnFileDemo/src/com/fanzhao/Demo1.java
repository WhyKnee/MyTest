package com.fanzhao;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File dir=new File("\\aaa");
        System.out.println(dir.mkdirs());
        File f1=new File("aaa\\a.txt");


    }
}
