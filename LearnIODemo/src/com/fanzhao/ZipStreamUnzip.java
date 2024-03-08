package com.fanzhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamUnzip {

    public static void main(String[] args)throws IOException {
        File file=new File("E:\\IOTest\\UnZipTest.zip");
        File dest=new File("E:\\IOTest\\source");
        unZip(file,dest);
    }

    private static void unZip(File file, File dest)throws IOException {
        ZipInputStream zis=new ZipInputStream(new FileInputStream(file));

        ZipEntry entry;
        while((entry = zis.getNextEntry())!=null){
            //is dir
            if(entry.isDirectory()){
                File fileDir=new File(dest,entry.getName());
                fileDir.mkdirs();
            }
            //is file
            else{
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.getName()));
               // FileInputStream fis=new FileInputStream(new File(file.getParent(),entry.getName()));

                byte[] bytes=new byte[1024*5];
                int len;
                while((len=zis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                //fis.close();
                fos.close();
            }
            zis.closeEntry();
        }
        zis.close();
    }
}
