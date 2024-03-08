package com.fanzhao.demos.waitandnotfiy2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook implements Runnable {
    ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);

    public Cook(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }


    @Override
    public void run() {
        while(true){
            try {
                queue.put("一碗面");
                System.out.println("放了一碗面");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
