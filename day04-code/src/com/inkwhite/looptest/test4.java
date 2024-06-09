package com.inkwhite.looptest;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*
        * 键盘录入两个数字，表示一个范围
        * 统计这个范围中
        * 既能被 3 整除，又能被 5 整除的数字有多少个*/
        int count = 0;
        System.out.println("请输入一个范围 :");
        Scanner sc = new Scanner(System.in);
        int range_left = sc.nextInt();
        int range_right = sc.nextInt();
        for (int i = range_left; i < range_right; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("该数字为 : " + i);
                count++;
            }
        }
        System.out.println("在(" + range_left + ", " + range_right + ")的范围内，" +
                "既能被 3 整除，又能被 5 整除的数字有 " + count + " 个");
    }
}
