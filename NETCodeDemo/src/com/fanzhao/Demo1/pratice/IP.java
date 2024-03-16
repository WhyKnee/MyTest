package com.fanzhao.Demo1.pratice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {
    public static InetAddress address;
    public static int port=10086;

    static {
        try {
            address = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
