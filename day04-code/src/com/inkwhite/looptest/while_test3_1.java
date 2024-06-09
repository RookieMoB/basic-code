package com.inkwhite.looptest;

import java.util.Scanner;

// 回文数第二种解法
public class while_test3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag_num = sc.nextInt();
        int num = flag_num;
        int all = 0;
        while(num != 0) {
            int flag = num % 10;
            num /= 10;
            all = all * 10 + flag;
        }
        num = flag_num;
        if (num == all) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
