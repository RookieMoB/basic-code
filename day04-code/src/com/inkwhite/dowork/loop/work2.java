package com.inkwhite.dowork.loop;

/*
 * 需求：键盘录入两个数字，表示一个范围。
 *    统计这个范围中。
 * 既能被3整除，又能被5整除数字有多少个？*/

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("请输入一个范围进行运算");
        Scanner sc = new Scanner(System.in);
        int range_left = sc.nextInt();
        int range_right = sc.nextInt();
        int count = 0;      // 符合条件进行+1
        for (int i = range_left; i <= range_right; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " 符合条件");
                count++;
            }
        }
        System.out.println("符合条件的一共有 : " + count);
    }
}
