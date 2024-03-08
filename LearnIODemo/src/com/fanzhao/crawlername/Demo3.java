package com.fanzhao.crawlername;


import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File fileSrc=new File(Test1.nameSrc);
        File fileCount=new File("E:\\IOTest\\count.txt");
        //count里没有数据则从零开始
        if(fileCount.length()==0){
            FileWriter fileWriter = new FileWriter(fileCount);
            fileWriter.write("0");
            fileWriter.close();
        }
        BufferedReader br=new BufferedReader(new FileReader(fileCount));
        int count =Integer.parseInt(br.readLine())+1;
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter(fileCount));
        bw.write(count+"");
        bw.close();
        String randomName;
        randomName=Demo1.getRandomName(fileSrc);
        if(count%3==0){
            randomName="张三";
        }
        System.out.println(randomName);
    }
}
