package com.fanzhao;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {



//        FileOutputStream fos=new FileOutputStream(file);
          String str="I'm handsome\n!666!";
//        fos.write(str.getBytes());
//        fos.close();
        File file=new File("E:\\IOTest\\aaa.txt");
        FileWriter fw=new FileWriter(file);
        FileReader fr=new FileReader(file);
        fw.write("你好");
        fw.close();
        int res=fr.read();
        System.out.println(res);
        fr.close();



    }

    public static void test(){


    }
}
