package com.fanzhao.demos.waitandnotify;

public class Cook implements Runnable{
        @Override
        public void run() {
            while (true) {
                synchronized (Desk.lock) {
                    if (Desk.count == 0) {
                        break;
                    } else {
                        if (Desk.deskFlag == 1) {
                            try {
                                Desk.lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println("厨师正在做");
                            Desk.deskFlag = 1;
                            Desk.lock.notifyAll();
                        }
                    }
                }
            }
            }

}
