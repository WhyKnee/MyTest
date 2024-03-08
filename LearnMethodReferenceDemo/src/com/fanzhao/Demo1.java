package com.fanzhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();

        Collections.addAll(arrayList,"张三，23","李四，24","王五，25");

        Student[] students = arrayList.stream()
                //类型转换为Student
                .map((s)->new Student(s.split("，")[0], Integer.parseInt(s.split("，")[1])))
                //toArray
                .toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }

    public Student apply(String s) {
        return new Student(s.split("，")[0], Integer.parseInt(s.split("，")[1]));
    }
}
