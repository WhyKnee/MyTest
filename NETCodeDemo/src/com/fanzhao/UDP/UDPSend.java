package com.fanzhao.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] bytes = "Hello".getBytes();
        //InetAddress address=InetAddress.getByName("127.0.0.1");
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,MyIP.address,MyIP.port);

        ds.send(dp);
        ds.close();
    }
}
