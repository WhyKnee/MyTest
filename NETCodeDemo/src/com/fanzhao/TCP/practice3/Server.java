package com.fanzhao.TCP.practice3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket ss=new ServerSocket(10000);
        //创建线程池对象
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            //开启连接等待
            Socket socket = ss.accept();
            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }


    }
}
