package com.fanzhao.demos.waitandnotfiy2;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);

        Cook c=new Cook(queue);
        Foodie f=new Foodie(queue);

        Thread t1=new Thread(c);
        Thread t2=new Thread(f);
        t1.start();t2.start();
    }
}
