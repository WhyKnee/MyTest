package com.fanzhao.studyMap.HashMapPractice1;

import com.fanzhao.studyMap.Student;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class TestDemo1 {
    public static void main(String[] args) {
        //Create HashMap 并存储键值对
        HashMap<Student,String> hashMap=new HashMap<>();
        Student s1=new Student("Judy",21);
        Student s2=new Student("Bob",17);
        Student s3=new Student("Jack",20);
        Student s4=new Student("Jack",20);
        hashMap.put(s1,"BeiJing");
        hashMap.put(s2,"Shanghai");
        hashMap.put(s3,"Nanjing");
        hashMap.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String address) {
                System.out.println(student.getName()+" "+student.getAge()+" "+address);
            }
        });
    }
}
