package com.fanzhao.Demo1.pratice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        while(true) {
            System.out.println("typing......:");
            Scanner sc = new Scanner(System.in);
            String message = sc.nextLine();

            byte[] messageBytes = message.getBytes();

            DatagramPacket dp = new DatagramPacket(messageBytes, messageBytes.length, IP.address, IP.port);

            ds.send(dp);
            if (message.equals("886")){
                break;
            }
        }
        ds.close();
    }

}
