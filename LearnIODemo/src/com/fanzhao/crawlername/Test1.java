package com.fanzhao.crawlername;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;

public class Test1 {
    protected static String fileSrc="E:\\IOTest\\Info.txt";
    protected static String nameSrc ="E:\\IOTest\\InfoName.txt";
    public static void main(String[] args) throws IOException {
        infoDataBase infoDataBase=new infoDataBase();
        HashSet<String> info = infoDataBase.generateInfo(5, 5);
        BufferedWriter bw=new BufferedWriter(new FileWriter(fileSrc, Charset.forName("utf-8")));
        BufferedWriter bw2=new BufferedWriter(new FileWriter(nameSrc, Charset.forName("utf-8")));
        for (String s : info) {
            bw.write(s);
            bw2.write(s.split("-")[0]);
            bw.newLine();
            bw2.newLine();
        }
        bw2.close();
        bw.close();
    }


}
