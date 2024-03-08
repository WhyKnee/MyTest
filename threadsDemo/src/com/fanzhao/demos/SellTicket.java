package com.fanzhao.demos;

public class SellTicket {
    public static void main(String[] args) {
        MyTickets myTickets1=new MyTickets();


        Thread thread1=new Thread(myTickets1);
        Thread thread2=new Thread(myTickets1);
        Thread thread3=new Thread(myTickets1);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
