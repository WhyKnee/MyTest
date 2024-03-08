package com.fanzhao;

import java.io.File;

public class Demo3 {

    public static void main(String[] args) {
    File file =new File("E:\\aaa");
        deleteFile(file);
    }


    public static void deleteFile(File file){
        File[] files = file.listFiles();
        if(files==null) return;

        for (File f : files) {
            if(f.isFile()){
                f.delete();
            }else{
                deleteFile(f);
            }

        }
    file.delete();
    }

}
