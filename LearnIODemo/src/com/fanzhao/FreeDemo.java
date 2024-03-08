package com.fanzhao;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FreeDemo {
    public static void main(String[] args) throws IOException {

        File file=new File("E:\\IOTest\\count.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
        String useTime;
        //为空
        if((useTime=br.readLine())==null){
             bw.write("1");
             useTime="1";
        }
        bw.close();
        br.close();
        System.out.println("第"+useTime+"次使用");
        int newTime=Integer.parseInt(useTime)+1;
        BufferedWriter bw2=new BufferedWriter(new FileWriter(file));
        bw2.write(String.valueOf(newTime));
        bw2.close();


    }

}
