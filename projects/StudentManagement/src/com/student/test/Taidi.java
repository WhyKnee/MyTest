package com.student.test;

public class Taidi extends Dog{
    @Override
    public void behavior() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"的泰迪正在蹭");
    }
}
