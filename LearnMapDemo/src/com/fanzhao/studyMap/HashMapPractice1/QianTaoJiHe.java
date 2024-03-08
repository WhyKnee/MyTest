package com.fanzhao.studyMap.HashMapPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

public class QianTaoJiHe {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap=new HashMap<>();
        ArrayList<String> arrayList1=new ArrayList();
        ArrayList<String> arrayList2=new ArrayList();
        ArrayList<String> arrayList3=new ArrayList();
        Collections.addAll(arrayList1,"南京","扬州","苏州","无锡","常州");
        Collections.addAll(arrayList2,"宜昌","鄂州","十堰","孝感","武汉");
        Collections.addAll(arrayList3,"张家口","保定","唐山","邢台","石家庄");

        hashMap.put("江苏",arrayList1);
        hashMap.put("湖北",arrayList2);
        hashMap.put("河北",arrayList3);

        hashMap.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String s, ArrayList<String> strings) {
                System.out.println(s+"->"+strings);
            }
        });
    }
}
