package com.fanzhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        File srcDir = new File("E:\\IOTest\\src");
        File aimDir = new File("E:\\IOTest\\aim");
        copyDir(srcDir, aimDir);
    }

    private static void copyDir(File src, File aim) throws IOException {
        if (src.isDirectory()) {
            if (!aim.exists()) {
                aim.mkdir();
            }

            String[] files = src.list();
            for (String file : files) {
                File srcFile = new File(src, file);
                File aimFile = new File(aim, file);
                copyDir(srcFile, aimFile);
            }
        } else {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(aim);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            fis.close();
            fos.close();
        }
    }
}

