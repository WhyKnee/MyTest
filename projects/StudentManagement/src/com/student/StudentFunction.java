package com.student;

import java.util.ArrayList;

public interface StudentFunction {
     //添加后返回当前学生集合
     ArrayList<Student> add(String id,String name,int age,String address);
     //根据id删除数据并返回被删除的对象
     Student delete(String id);
     //返回条件符合的学生对象
     Student select(String id);
     //修改指定id对象的值
     void update(String id);
}
