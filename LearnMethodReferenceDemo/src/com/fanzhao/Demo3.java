package com.fanzhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Demo3 {

    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();

        Collections.addAll(arrayList,new Student("zhangsan",23),new Student("lisi",24),new Student("wangwu",25));

//        String[] infoArray   = arrayList.stream()
//                .map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName() +"-"+ student.getAge();
//            }
//        })
//                .toArray(String[]::new);

        String[] infoArray   = arrayList.stream()
                .map(Student::getInfo)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(infoArray));
    }

}
