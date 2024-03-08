package com.fanzhao.demos.waitandnotify;

public class test {
    public static void main(String[] args) {
        Cook c=new Cook();
        Foodie f=new Foodie();

        Thread cook=new Thread(c);
        Thread foodie=new Thread(f);

        cook.start();
        foodie.start();
    }
}
