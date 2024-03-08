package com.fanzhao.crawlername;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo2 {

    public static void main(String[] args)throws IOException {
        File file=new File(Test1.fileSrc);
        BufferedReader br=new BufferedReader(new FileReader(file));
        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        String data;
        while((data=br.readLine())!=null){
            String sex=data.split("-")[1];
            if(sex.equals("男")){
                boyList.add(data.split("-")[0]);
            }else{
                girlList.add(data.split("-")[0]);

            }
        }
        br.close();
        int boyCount=0,girlCount=0;
        while(girlCount+boyCount<1000000) {
            int index = new Random().nextInt(10);
            if (index <= 6) {
                Collections.shuffle(boyList);
                boyCount++;
                System.out.println(boyList.get(0));
            } else {
                Collections.shuffle(girlList);
                girlCount++;
                System.out.println(girlList.get(0));
            }
        }
        float perBoy=(float) boyCount/(girlCount+boyCount);
        float perGirl=1-perBoy;
        System.out.println("BoyCountPer="+perBoy);
        System.out.println("GirlCountPer="+perGirl);
    }

}
