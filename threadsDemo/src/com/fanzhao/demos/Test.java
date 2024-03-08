package com.fanzhao.demos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Method1 t1=new Method1();
//        Method1 t2=new Method1();
//        t1.setName("线程1");
//        t2.setName("线程2");
//
//        t1.start();
//        t2.start();
//        Method2 m=new Method2();
//        Thread t1=new Thread(m);
//        Thread t2=new Method1();
//        Thread t3=new Thread(m);
//        t1.setName("线程1");
//        t3.setName("线程3");
//        t2.setName("线程2");
//        t1.start();
//        t2.start();
//        t3.start();
        CallableTest ct=new CallableTest();
        FutureTask<Integer> ft=new FutureTask<>(ct);
        Thread t1=new Thread(ft);
        t1.start();
        int o = ft.get();System.out.println(o);

    }
}
