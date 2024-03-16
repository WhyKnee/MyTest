package com.fanzhao.TCP.practice2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket ss=new ServerSocket(10000);
        //开启连接等待
        Socket socket = ss.accept();
        //获取数据并保存到本地
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        String fileName= UUID.randomUUID().toString().replace("-","");
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\IOTest\\ServerFile\\"+fileName+".png"));
        byte[] bytes=new byte[1024*10];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        bos.close();
        //结束标记
        socket.shutdownInput();

        //开始回写
        OutputStream os = socket.getOutputStream();
        String msg="File is UpLoaded";
        os.write(msg.getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();
        //断开连接
        socket.close();
        //关闭服务器
        ss.close();
    }
}
