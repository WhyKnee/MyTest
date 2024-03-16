package com.fanzhao.TCP.practice3;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class MyRunnable implements Runnable{
    Socket socket;
    Object lock=new Object();

    public MyRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            //获取数据并保存到本地
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            String fileName= UUID.randomUUID().toString().replace("-","");
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\IOTest\\ServerFile\\"+fileName+".png"));
            byte[] bytes=new byte[1024*10];
            int len;
            synchronized (lock) {
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                    bos.flush();
                }
                bos.close();
            }
            //结束标记
            socket.shutdownInput();

            //开始回写
            OutputStream os = socket.getOutputStream();
            String msg="File is UpLoaded";
            os.write(msg.getBytes(StandardCharsets.UTF_8));
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
