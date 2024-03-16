package com.fanzhao.TCP.practice1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        InetAddress address=InetAddress.getByName("127.0.0.1");
        int port=10000;
        Socket socket=new Socket(address.getHostAddress(),port);

        OutputStream outputStream = socket.getOutputStream();

        while (true) {
            System.out.println("typing......:");
            String str=new Scanner(System.in).nextLine();

            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            if(str.equals("exit")){
                break;
            }
        }


        outputStream.close();
        socket.close();
    }
}
