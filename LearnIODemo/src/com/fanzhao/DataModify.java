package com.fanzhao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class DataModify {
    public static void main(String[] args) throws IOException{

        modify(new File("E:\\IOTest\\testFileSort.txt"));
    }

    private static void modify(File srcFile) throws IOException {
        if(!srcFile.isFile())return;
        FileInputStream fis=new FileInputStream(srcFile);
        int data;
        char specialSign='-';
        ArrayList<Integer> dataList=new ArrayList<>();
        while((data=fis.read())!=-1){
            if(data==(int)specialSign)continue;
            dataList.add(data);
        }
        fis.close();
        dataList.sort((o1, o2)-> o1-o2);
        FileOutputStream fos=new FileOutputStream(srcFile);
        int i=0;
        for (Integer newData : dataList) {
            ++i;
            if(i==dataList.size())fos.write(newData);
            else{fos.write(newData);fos.write((int)specialSign);}
        }
        fos.close();
    }


}
