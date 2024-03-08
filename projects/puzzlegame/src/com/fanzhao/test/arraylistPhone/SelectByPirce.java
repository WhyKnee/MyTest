package com.fanzhao.test.arraylistPhone;

import java.util.ArrayList;

public class SelectByPirce {
    static ArrayList<Phone> arrayList=new ArrayList<>();
    static int LIMIT_PRICE=3000;
    public static void main(String[] args) {
        arrayList.add(new Phone("HUAWEI",5000));
        arrayList.add(new Phone("Xiaomi",3500));
        arrayList.add(new Phone("IPhone",8000));
        arrayList.add(new Phone("VIVO",2500));
        arrayList.add(new Phone("OPPO",3300));
        arrayList.add(new Phone("OnePlus",1500));
        ArrayList<Phone> arrayList1=search(arrayList);
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i).getBrand()+","+arrayList1.get(i).getPrice());
        }
    }
    public static ArrayList<Phone> search(ArrayList<Phone> arrayList){
        ArrayList<Phone> resultList=new ArrayList<Phone>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getPrice()<=LIMIT_PRICE){
                resultList.add(arrayList.get(i));
            }else{
                continue;
            }
        }
        return resultList;

    }
}
