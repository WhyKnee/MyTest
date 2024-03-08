package com.fanzhao.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"张三，23","李四，24","王五，25");
        List<Actors> actorsList= arrayList.stream()
                .map(new Methods()::apply)
                .collect(Collectors.toList());
        System.out.println(actorsList);
    }
}
