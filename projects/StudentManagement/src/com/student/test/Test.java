package com.student.test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        ArrayList<Dog> list1=new ArrayList<>();
        ArrayList<Cat> list2=new ArrayList<>();
        LihuaCat c1=new LihuaCat();
        c1.setAge(1);c1.setName("Cat1");
        BossCat c2=new BossCat();
        c2.setAge(2);c2.setName("Cat2");
        Hashiqi h1=new Hashiqi();
        Hashiqi h2=new Hashiqi();
        Hashiqi h3=new Hashiqi();
        Taidi t1=new Taidi();
        t1.setAge(2);t1.setName("DamnDog");
        h1.setAge(1);h1.setName("Puppy");
        h2.setAge(3);h2.setName("Hop");
        h3.setAge(3);h3.setName("Judy");
        list1.add(h1);
        list1.add(h3);
        list1.add(h2);
        list1.add(t1);
        list2.add(c1);
        list2.add(c2);
        keepPetDog(list1);
        keepPetCat(list2);
    }

    public static void keepPetDog(ArrayList<? extends Dog> dogs){
        for (Dog dog1 : dogs) {
            dog1.behavior();
        }
    }
    public static void keepPetCat(ArrayList<? extends Cat> cats){
       cats.forEach((Cat cat)->cat.behavior());
    }
}
