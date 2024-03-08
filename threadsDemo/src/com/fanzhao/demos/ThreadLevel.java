package com.fanzhao.demos;

public class ThreadLevel {
    public static void main(String[] args) {

        Method1 m1=new Method1();
        m1.setName("P1");

        Method2 m2=new Method2();
        Thread t=new Thread(m2);
        t.setName("P2");
        m1.setPriority(10);
        t.setPriority(1);

        m1.start();
        t.start();

    }
}
