package com.fanzhao.TCP.practice1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10000);


        Socket socket=serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            InputStreamReader isr=new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            int data;
            while((data=isr.read())!=-1){
                System.out.print((char)data);
            }

        socket.close();
        serverSocket.close();
    }
}
