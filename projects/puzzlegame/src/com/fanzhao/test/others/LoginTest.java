//package com.fanzhao.test;
//
//import java.util.Scanner;
//
//public class LoginTest {
//    private static String User_Name="zhangsan";
//    private static String Pass_Word="123456";
//
//    public static void main(String[] args) {
//
//
//        int errNum = 1;
//        while (errNum <= 3) {
//            if(errNum>3) {
//                System.out.println("错误已超过3次！无法重新输入");
//                break;
//            }
//            //通过键盘输入用户名与密码
//            Scanner sc = new Scanner(System.in);
//            String username;
//            String pwd;
//            System.out.print("请输入用户名:");
//            System.out.println();
//            username = sc.next();
//            System.out.print("请输入用户密码:");
//            System.out.println();
//            pwd = sc.next();
//            Account user1 = new Account(username, pwd);
//            //判断是否账号密码是否一致
//            if (user1.getUsername().equals(User_Name)) {
//                if (user1.getPwd().equals(Pass_Word)) {
//                    System.out.println("成功登录");
//                    break;
//                } else {
//                    System.out.println("密码错误！请重新输入！");
//                    errNum++;
//                    System.out.println("还有"+(4-errNum)+"次机会");
//                    continue;
//                }
//            } else {
//                System.out.println("账号不存在！请重新输入！");
//                errNum++;
//                System.out.println("还有"+(4-errNum)+"次机会");
//                continue;
//            }
//        }
//    }
//}
