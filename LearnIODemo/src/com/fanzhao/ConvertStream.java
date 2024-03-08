package com.fanzhao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStream {
    public static void main(String[] args)throws IOException {
        File file=new File("a.txt");
        File aim=new File("b.txt");
        convert(file,aim);
    }

    private static void convert(File file,File aim)throws IOException {
        FileReader fr=new FileReader(file, Charset.forName("utf-8"));
        int data;
        FileWriter fw=new FileWriter(aim,Charset.forName("gbk"));
        while((data=fr.read())!=-1){
            fw.write(data);
        }
        fw.close();
        fr.close();
    }
}
