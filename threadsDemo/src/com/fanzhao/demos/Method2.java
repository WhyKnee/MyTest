package com.fanzhao.demos;

import java.util.GregorianCalendar;

public class Method2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+": Hello");
        }
    }
}
