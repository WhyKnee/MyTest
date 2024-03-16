package com.fanzhao.TCP.practice2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建连接对象
        Socket socket=new Socket("127.0.0.1",10000);
        //创建IO流传输数据
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\IOTest\\ClientFile\\Elysia.png"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());

        //将文件上传到服务器中
        byte[] bytes=new byte[1024*10];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        bis.close();
        //结束标记
        socket.shutdownOutput();
        //接收服务器回写信息
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
        br.close();
        //释放资源
        socket.close();
    }
}
