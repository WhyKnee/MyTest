package com.fanzhao.demos;

import javax.swing.*;

public class MyTickets implements Runnable{
    private int ticket=1;

    @Override
    public void run() {
        while(true){
            if(!method())break;
        }
    }

    private synchronized boolean method(){
        if(ticket<=100){

            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票！");
            ticket++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }else
            return false;
    }
}
