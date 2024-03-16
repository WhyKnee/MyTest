package com.fanzhao.Demo1.pratice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Reciever {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(IP.port);

            byte[] bytes = new byte[1024 * 10];

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            while (true) {
                ds.receive(dp);

                byte[] data = dp.getData();
                String message = new String(data, 0, dp.getLength());
                Date date=new Date();
                long time = date.getTime();
                SimpleDateFormat sdf=new SimpleDateFormat();
                if(message.equals("886")){
                    ds.close();
                    break;
                }
                System.out.println("Received Message From" + dp.getAddress() +"  "+sdf.format(time)+ ":");

                System.out.println(message);
            }
        ds.close();
    }
}
