package com.fanzhao;

import java.io.*;

public class FileCopyDemo2  {
    public static void main(String[] args)throws IOException {
        File copiedfile =new File("C:\\Users\\13350\\Videos\\SEKIRO  SHADOWS DIE TWICE\\SEKIRO  SHADOWS DIE TWICE 2024.02.19 - 15.39.06.03.mp4");
        File newFile=new File("E:\\IOTest\\HugeFileCopy.mp4");
        copy(copiedfile,newFile.getAbsolutePath());
    }

    public static void copy(File file, String path)throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(path);
        byte[] bytes=new byte[1024*1024*10];
        while(true){
            int len = fis.read(bytes);
            if(len==-1)break;
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
