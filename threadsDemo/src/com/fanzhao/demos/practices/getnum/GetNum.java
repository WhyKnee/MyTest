package com.fanzhao.demos.practices.getnum;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GetNum extends Thread{

    //创建集合用来存储获得的数字
    ArrayList<Integer> arrayList=new ArrayList<>();

    @Override
    public void run() {
        ArrayList<Integer> threadArr = storeNum();
        ArrayList<Integer> resultArr=new ArrayList<>();
        for (int i = 0; i < threadArr.size(); i++) {
            if(threadArr.get(i)%2!=0){
                resultArr.add(threadArr.get(i));
            }
        }
        System.out.println(getName()+"输出结果"+resultArr);
    }

    public ArrayList<Integer> storeNum(){
        while(true) {
            synchronized (Num.lock) {
                    //获取数字
                    if (Num.number >= 1) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "已存储" + Num.number);
                        arrayList.add(Num.number--);
                    } else break;
                }
            }
        System.out.println(Thread.currentThread().getName()+"中的数据为"+ arrayList);
        return arrayList;
    }
}
