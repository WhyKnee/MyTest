package com.fanzhao.demos;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
        return sum;


    }
}
