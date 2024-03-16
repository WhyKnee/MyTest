package com.fanzhao.Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(MyIP.port);
        DatagramPacket dp=new DatagramPacket(new byte[1024],0,1024);
        ds.receive(dp);

        byte[] data = dp.getData();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println(new String(data, 0, dp.getLength(), StandardCharsets.UTF_8));
        System.out.println("From"+address+"   "+port);

    }

}
