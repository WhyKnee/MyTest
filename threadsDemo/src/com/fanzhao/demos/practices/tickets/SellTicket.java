package com.fanzhao.demos.practices.tickets;

public class SellTicket implements Runnable {
    private int ticket=1000;
    @Override
    public void run() {
        //获取当前剩余票数

        //循环卖票
        while(true){
            //设置锁
            synchronized (Ticket.lock){
                //如果没票则停止循环
                if(ticket==0){break;}
                //如果有票则卖出
                else {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println( Thread.currentThread().getName()+ "正在卖----"+(ticket--)+"号票----");
                }
            }
        }
    }
}
