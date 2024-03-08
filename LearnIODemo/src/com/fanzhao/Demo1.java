package com.fanzhao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        File file=new File("E:\\IOTest");
        file.mkdirs();
        File txtFile=new File("E:\\IOTest\\test1.txt");
        file.createNewFile();

        FileOutputStream fos=new FileOutputStream(txtFile);
        String info="Hello World!";
        fos.write(info.getBytes());

        String info2="\n666";

        fos.write(info2.getBytes());
        fos.close();

    }
}
