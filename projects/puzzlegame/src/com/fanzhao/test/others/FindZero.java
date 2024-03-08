package com.fanzhao.test.others;

import java.util.Random;

public class FindZero {
    public FindZero(){
        int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        Random r=new Random();
        for (int i=0;i<arr1.length;i++) {
            int randomIndex=r.nextInt(arr1.length);
            int temp=arr1[i];
            arr1[i]=arr1[randomIndex];
            arr1[randomIndex]=temp;
        }

        int data[][]=new int[4][4];
        int next=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j]=arr1[next];
                next++;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]==0){
                    int y=i;
                    int x=j;
                    System.out.println(y+" "+x);
                }
            }
        }
    }
}
