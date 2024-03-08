package com.fanzhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {

    public static void main(String[] args) {
        File copiedFile =new File("E:\\IOTest\\Test1.txt");
        File newFile=new File("E:\\IOTest\\Test2C.txt");
        try {
            copy(copiedFile,newFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void copy(File file,String path)throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(path);
        while(true){
            int data=fis.read();
            if(data==-1)break;
            fos.write(data);
        }
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
