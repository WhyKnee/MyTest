package com.fanzhao.crawlername;
import java.io.*;
import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            testMethod();
        }
    }
    public static void testMethod()throws IOException{
        //创建一个文件用来存放已点过的名字
        File namedFile=new File("E:\\IOTest\\named.txt");
        if(!namedFile.exists())namedFile.createNewFile();
        //判断是否全点过
        if(namedFile.length()>=new File(Test1.nameSrc).length()){
            //若点过则清空点名文件
            new FileOutputStream(namedFile);
        };
        //创建输入流用来读取已点过的名字
        BufferedReader br=new BufferedReader(new FileReader(namedFile));
        String name;
        ArrayList<String> namedList = new ArrayList<>();
        //将所有点过的名字放入集合中
        while((name=br.readLine())!=null){
            namedList.add(name);
        }
        //获取一个随机名字
        String randomName = Demo1.getRandomName(new File(Test1.nameSrc));
        //判断集合中是否含有该数据
        if(namedList.contains(randomName)){
         //含有则递归
            testMethod();
        }else{
          //不含则写入文件named
            System.out.println(randomName);
            BufferedWriter bw=new BufferedWriter(new FileWriter(namedFile,true));
            bw.write(randomName);
            bw.newLine();
            bw.close();
        }
    }
}
