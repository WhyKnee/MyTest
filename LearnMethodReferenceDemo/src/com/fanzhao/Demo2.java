package com.fanzhao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();

        Collections.addAll(arrayList,new Student("zhangsan",23),new Student("lisi",24),new Student("wangwu",25));

//        String[] nameArray = arrayList.stream()
//                .map(new Function<Student, String>() {
//                    @Override
//                    public String apply(Student student) {
//                        return student.getName();
//                    }
//                })
//                .toArray(String[]::new);

        String[] nameArray = arrayList.stream()
                .map(Student::getName)
                .toArray(String[]::new);
        for (String s : nameArray) {
            System.out.println("Name is -> "+s);
        }
    }

    }
