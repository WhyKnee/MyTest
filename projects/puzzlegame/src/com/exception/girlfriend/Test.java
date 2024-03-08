package com.exception.girlfriend;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("请输入女朋友的名字：");
                String name = sc.nextLine();
                System.out.println();
                gf.setName(name);
                System.out.print("请输入女朋友的年龄：");
                String ageStr = sc.nextLine();
                System.out.println();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }catch (NameFormatException e){
                e.printStackTrace();
            }
        }
        System.out.println(gf);
    }
}
