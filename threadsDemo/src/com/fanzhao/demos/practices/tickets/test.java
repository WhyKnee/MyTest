package com.fanzhao.demos.practices.tickets;

public class test {
    public static void main(String[] args) {
        SellTicket s=new SellTicket();

        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t1.start();t2.start();

    }
}
