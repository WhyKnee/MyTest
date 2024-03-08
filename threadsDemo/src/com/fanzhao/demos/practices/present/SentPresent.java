package com.fanzhao.demos.practices.present;

public class SentPresent extends Thread{
    @Override
    public void run() {
        int count=Present.count;
        while(true){
            synchronized (Present.lock){
                //判断数量是否小于10
                if(count<10){
                    break;
                }else {
                    System.out.println(getName()+"已将礼物送出，礼物剩余......"+(--count));
                }
            }
        }
    }
}
