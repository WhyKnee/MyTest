package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Student stu=new Student();
    public static void main(String[] args) {
     loop:while(true){
         mainPage();
         //通过键盘录入选择功能
         Scanner sc=new Scanner(System.in);
         int result=sc.nextInt();
         switch (result){
             case 1: {
                 System.out.println("请输入ID，姓名，年龄，住址");
                 stu.add(sc.next(),sc.next(),sc.nextInt(),sc.next());
                 continue loop;
             }
             case 2:{
                 System.out.println("请输入要删除的学生ID");
                 stu.delete(sc.next());
                 continue loop;
             }
             case 3: {
                 System.out.println("请输入要查询的学生的ID");
                 stu.select(sc.next());
                 continue loop;
             }
             case 4:{
                 stu.show();
                 continue loop;
             }
             case 5:{
                 System.out.println("请输入要修改的学生的id");
                 stu.update(sc.next());
                 continue loop;
             }
             case 6:System.exit(0);
             default:
                 System.out.println("请输入正确的功能编号");
         }
     }
    }



    public static void mainPage(){
        System.out.println("------欢迎来到学生管理系统------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:查询学生");
        System.out.println("4:打印信息");
        System.out.println("5:修改信息");
        System.out.println("6:退出");
        System.out.print("请输入功能编号:");
    }
}
