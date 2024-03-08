package com.fanzhao.demos.practices.getnum;

public class Test {
    public static void main(String[] args) {

        Thread t1=new GetNum();
        Thread t2=new GetNum();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
