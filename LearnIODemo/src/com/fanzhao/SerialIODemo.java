package com.fanzhao;

import java.io.*;
import java.util.ArrayList;

public class SerialIODemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1=new Student("aa",23);
        Student s2=new Student("ab",23);
        Student s3=new Student("ac",23);

        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("objects.txt"));
        oos.writeObject(arrayList);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("objects.txt"));
        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
        for (Student s : students) {
            System.out.println(s);
        }
        oos.close();
        ois.close();

    }
}
