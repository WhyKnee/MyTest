package com.fanzhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args)throws IOException {
        File file =new File("E:\\IOTest\\test1.txt");
        FileInputStream fis=new FileInputStream(file);
        while(true){
            int data=fis.read();
            if(data==-1)break;
            System.out.print((char)data);

        }
         fis.close();
    }
}
