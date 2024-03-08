package com.student.test;

public abstract class Animal {
    private String name;
    private int age;
    public abstract void behavior();

    public void setName(String name){
       this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
