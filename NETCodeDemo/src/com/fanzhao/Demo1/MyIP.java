package com.fanzhao.Demo1;

import javax.imageio.IIOParam;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ThreadPoolExecutor;

public class MyIP {
    public static InetAddress address;

    static {
        try {
            address = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static int port=10086;



    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("FZ_PC");
        //InetAddress address=InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.getHostName());
        System.out.println(address.getAddress());
        System.out.println(address.getHostAddress());

    }
}
