package com.fanzhao.demos.waitandnotfiy2;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie implements Runnable {
    ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);

    public Foodie(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                String food = queue.take();
                System.out.println("Consume"+food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
