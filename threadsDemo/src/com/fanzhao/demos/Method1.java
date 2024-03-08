package com.fanzhao.demos;

public class Method1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"Hello!");
        }
    }
}
