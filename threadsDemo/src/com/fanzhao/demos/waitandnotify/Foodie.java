package com.fanzhao.demos.waitandnotify;

public class Foodie implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.deskFlag == 1) {
                        System.out.println("吃货正在吃,还剩"+(--Desk.count)+"碗。");
                        Desk.lock.notify();
                        Desk.deskFlag=0;
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }
}
