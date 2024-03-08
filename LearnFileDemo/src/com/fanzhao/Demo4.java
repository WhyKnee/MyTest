package com.fanzhao;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    static Map<String,Integer> fileType=new HashMap<>();
    public static void main(String[] args) {
        File file=new File("E:\\");
        countFileType(file);
        Set<Map.Entry<String, Integer>> entries = fileType.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey()+":"+entry.getValue()+"\n");
        }

    }

    public static void countFileType(File file){
        File[] files = file.listFiles();
        int typeCount=1;
        if(files==null)return;
        for (File f : files) {
            if(f.isFile()){
                String fileName=f.getName();
                String[] splitArr = fileName.split("\\.");
                if(splitArr.length>=2) {
                    String typeName=splitArr[splitArr.length-1];

                    if (fileType.containsKey(typeName)) {
                        fileType.put(typeName, ++typeCount);
                    } else {
                        fileType.put(typeName, typeCount);
                    }
                }
            }else{
                countFileType(f);
            }
        }
    }

}
