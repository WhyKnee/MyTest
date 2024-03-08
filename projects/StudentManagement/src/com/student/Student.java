package com.student;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Student implements StudentFunction {
    private String id;
    private String name;
    private int age;
    private String address;
    private ArrayList<Student> arrayList=new ArrayList<>();
    public Student() {

    }

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", age = " + age + ", address = " + address + "}";
    }
    public void show(){
        if(arrayList.size()==0) {
            System.out.println("当前无数据");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getId()+","+arrayList.get(i).getName()+","
                    +arrayList.get(i).getAge()+","+arrayList.get(i).getAddress());
        }
    }
    //添加学生
    @Override
    public ArrayList<Student> add(String id, String name, int age, String address) {
        if(this.sameID(id)){
            this.arrayList.add(new Student(id,name,age,address));
        }
        return this.arrayList;
    }
    //判断是否存在相同uid，若相同则返回false，否则返回true
    private boolean sameID(String id){
        for (int i = 0; i < arrayList.size(); i++) {
           if( arrayList.get(i).getId().equals(id)){
               System.out.println("ID已存在！请重新输入ID");
               return false;
           }
        }
        return true;
    }

    @Override
    public Student delete(String id) {
        int index;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getId().equals(id)) {
                index=i;
                Student deletedInfo=arrayList.get(index);
                System.out.println("已删除ID为"+arrayList.get(index).getId()+"的学生");
                arrayList.remove(index);
                return deletedInfo;
            }
        }
        System.out.println("未找到ID为"+id+"的学生");
        return null;
    }

    @Override
    public Student select(String id) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId().equals(id)) {
                System.out.println(arrayList.get(i));
                return arrayList.get(i);
            }
        }
        System.out.println("没有找到要查询的对象");
        return null;
    }

    @Override
    public void update(String id){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入更改后的名字");
        String newName=sc.next();
        System.out.println("请输入更改后的年龄");
        int newAge=sc.nextInt();
        System.out.println("请输入更改后的地址");
        String newAddress=sc.next();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getId().equals(id)){
                arrayList.set(i,new Student(id,newName,newAge,newAddress));
                return;
            }
        }
        System.out.println("没有对应的id");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(arrayList, student.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, address, arrayList);
    }
}