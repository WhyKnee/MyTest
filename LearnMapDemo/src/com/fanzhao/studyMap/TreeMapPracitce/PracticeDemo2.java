package com.fanzhao.studyMap.TreeMapPracitce;

import com.fanzhao.studyMap.Student;

import java.util.TreeMap;

public class PracticeDemo2 {
    public static void main(String[] args) {
        //创建学生对象
        Student stu1=new Student("Jack",17);
        Student stu2=new Student("Bob",18);
        Student stu3=new Student("LiHua",19);
        //创建TreeMap对象
        TreeMap<Student,String> tmp=new TreeMap<>();
        tmp.put(stu1,"Beijng");
        tmp.put(stu2,"Shanghai");
        tmp.put(stu3,"Henan");
        System.out.println(tmp);

    }
}
