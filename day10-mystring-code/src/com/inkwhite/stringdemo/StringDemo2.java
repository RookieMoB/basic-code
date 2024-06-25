package com.inkwhite.stringdemo;

import java.util.Scanner;

// 已知正确的用户名和密码，请用程序实现模拟用户登陆
// 总共给三次机会，登录之后，给出相应的提示
public class StringDemo2 {
    public static void main(String[] args) {
        String target_username = "admin";
        String target_password = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("--- 欢迎使用XXX系统 ---");
        System.out.println("----------------------");
        int count = 0;
        while (count < 3) {
            System.out.println("----------------------");
            System.out.println("---   请输入 账号   ---");
            System.out.println("----------------------");
            String cur_username = sc.next();
            if (cur_username.equals(target_username)) {
                System.out.println("----------------------");
                System.out.println("---   请输入 密码   ---");
                System.out.println("----------------------");
                String cur_password = sc.next();
                if (cur_password.equals(target_password)) {
                    System.out.println("----------------------");
                    System.out.println("---    登录 成功    ---");
                    System.out.println("----------------------");
                    break;
                } else {
                    System.out.println("----------------------");
                    System.out.println("---您输入的密码不正确---");
                    System.out.println("----------------------");
                }
            } else {
                System.out.println("----------------------");
                System.out.println("---您输入的账号不正确---");
                System.out.println("----------------------");
            }
            count++;
            if (count == 3) {
                System.out.println("尝试登录次数已用尽");
                break;
            }
        }
    }
}
