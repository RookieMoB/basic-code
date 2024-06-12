package com.inkwhite.dowork.loop;

import java.util.Scanner;

// 键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
public class work1 {
    public static void main(String[] args) {
        System.out.println("请输入范围进行计算");
        Scanner sc = new Scanner(System.in);
        int range_left = sc.nextInt();      // 左范围
        int range_right = sc.nextInt();     // 右范围
        int sum = 0;        // 用于存放这个范围的和
        for (int i = range_left; i <= range_right; i++) {
            sum += i;
        }
        System.out.println("(" + range_left + ", " + range_right + ")范围的和为 : " + sum);
    }
}
