package com.fanzhao.stream;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayListMale=new ArrayList<>();
        arrayListMale.add("张三，23");
        arrayListMale.add("李四，27");
        arrayListMale.add("林俊杰，38");
        arrayListMale.add("华晨宇，33");
        arrayListMale.add("张杰，38");
        arrayListMale.add("周杰伦 ，42");

        ArrayList<String> arrayListFemale=new ArrayList<>();
        arrayListFemale.add("杨一，23");
        arrayListFemale.add("杨二，27");
        arrayListFemale.add("韩红，42");
        arrayListFemale.add("张靓颖，31");
        arrayListFemale.add("孙燕姿，38");
        arrayListFemale.add("杨丞琳 ，28");

        ArrayList<Actors> actorlist=new ArrayList<>();

        Stream<String> stream1 = arrayListMale.stream()
                .filter(s -> s.split("，")[0].length() == 3)
                .limit(2);
        Stream<String> stream2=arrayListFemale.stream()
                .filter(s->s.split("，")[0].startsWith("杨"))
                .skip(1);
        Stream.concat(stream1,stream2).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                String name=s.split("，")[0];
                int age=Integer.parseInt(s.split("，")[1]);
                Actors actor=new Actors(name,age);
                actorlist.add(actor);
            }
        });

        System.out.println(actorlist);
    }
}
