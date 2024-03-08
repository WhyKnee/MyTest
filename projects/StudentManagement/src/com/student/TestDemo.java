package com.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class TestDemo {
    public static void main(String[] args) {
        String[] arr={"ahhdal","wajda","sajkflk","ashd2jka","asjd","uiuoijals","ashokahfskj","01"};

        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
//        Integer[] arrLengthIndex=new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arrLengthIndex[i]=arr[i].length();
//            System.out.println(arrLengthIndex[i]);
//        }
//        Arrays.sort(arrLengthIndex, (o1,o2)-> o1-o2);
//        System.out.println(Arrays.toString(arrLengthIndex));
//        for (int i = 0; i < arrLengthIndex.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arrLengthIndex[i]==arr[j].length()){
//                    String temp;
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

       ArrayList<String> arrayList=new ArrayList<>();
       arrayList.add(arr[0]);
       arrayList.add(arr[1]);
       arrayList.add(arr[2]);
       arrayList.add(arr[3]);
       arrayList.forEach((String s)->System.out.println(s));
    }

}
