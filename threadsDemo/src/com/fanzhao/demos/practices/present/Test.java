package com.fanzhao.demos.practices.present;

public class Test {
    public static void main(String[] args) {
        Thread th1 = new SentPresent();
        Thread th2 = new SentPresent();
        th1.setName("Thread1");
        th2.setName("Thread2");
        th1.start();th2.start();
    }
}
