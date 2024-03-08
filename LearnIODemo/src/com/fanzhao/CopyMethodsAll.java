package com.fanzhao;

import java.io.*;

public class CopyMethodsAll {

    public static void main(String[] args) throws IOException {
            File file=new File("E:\\IOTest\\Data.txt");
            File newFile1=new File("E:\\IOTest\\BufferedStream\\copy1.txt");
            File newFile2=new File("E:\\IOTest\\BufferedStream\\copy2.txt");
            bufferedCopyOneByte(file,newFile1);
            bufferedCopyByteArray(file,newFile2);
    }

    private static void bufferedCopyOneByte(File src,File aim)throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(aim));
        int data;
        while((data=bis.read())!=-1){
            bos.write((char)data);
        }
    }

    private static void bufferedCopyByteArray(File src,File aim)throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(aim));
        int len;
        byte[] data=new byte[1024];
        while((len=bis.read(data))!=-1){
            bos.write(data,0,len);
        }
    }

    private static void BufferedCopyCharStream(File src,File aim)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(src));
    }

}
