package com.fanzhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DirCopy {

    public static void main(String[] args) throws IOException {
        File file1=new File("E:\\IOTest\\src");
        File file2=new File("E:\\IOTest\\aim");
        copyDir(file1,file2);
    }

    private static void copyDir(File src,File aim) throws IOException {
        if(!src.exists()) {System.out.println("源文件不存在");return;}
        if(src.isFile()){FileCopyDemo2.copy(src,new File(aim,src.getName()).getAbsolutePath());}
        File[] files = src.listFiles();
        if(files==null||!aim.exists())return;
        for (File f : files) {
            if(f.isFile()){
                FileInputStream fis=new FileInputStream(f);
                FileOutputStream fos=new FileOutputStream(new File(aim.getAbsolutePath(),f.getName()));
                byte[] bytes=new byte[1024*1024*10];
                while(true){
                    int len= fis.read(bytes);
                    if(len==-1)break;
                    fos.write(bytes,0,len);
                }
                fis.close();
                fos.close();
            }else{
                File anoDir=new File(aim,f.getName());
                anoDir.mkdirs();
                copyDir(f,new File(aim,f.getName()));
            }
        }
    }


}
