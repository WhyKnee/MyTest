package com.fanzhao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CreateFileData {

    public static void main(String[] args) throws IOException {
        File file=new File("E:\\IOTest\\Data.txt");
        FileOutputStream fos=new FileOutputStream(file);
        int i=1;
        while(i<=8000){
            String str="Hello!World\r\n";
            byte[] bytes=str.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            i++;
        }
    }
}
