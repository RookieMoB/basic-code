package com.inkwhite.test;

import java.util.Scanner;

public class switch_test1 {
    public static void main(String[] args) {
        /*
        * 需求：键盘录入星期数，输出工作日、休息日
        * （1 - 5） 工作日，（6 - 7） 休息日*/
        System.out.println("请输入今天是星期几 :");
        Scanner sc = new Scanner(System.in);
        int curr_week = sc.nextInt();
        switch (curr_week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("输入不合法");
        }
    }
}
