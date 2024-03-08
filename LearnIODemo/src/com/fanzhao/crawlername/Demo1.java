package com.fanzhao.crawlername;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file =new File(Test1.fileSrc);
        System.out.println(getRandomName(file));

    }
    protected static String getRandomName(File file)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(file));
        ArrayList<String> arrayList=new ArrayList<>();
        String data;
        int i=0;
        while((data=br.readLine())!=null){
            arrayList.add(data.split("-")[0]);
        }
        br.close();
        Collections.shuffle(arrayList);
        return arrayList.get(0);
    }
}
