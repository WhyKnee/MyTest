package com.exception.girlfriend;

public class GirlFriend{
    private int age;
    private String name;

    public void setAge(int age) {
        if(age>25||age<13){
            throw new AgeOutOfBoundsException(age+"年龄超出范围！");
        }
        this.age = age;
    }

    public void setName(String name) {
        if(name.length()<3||name.length()>10){
            throw new NameFormatException(name+"名字格式错误！");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
