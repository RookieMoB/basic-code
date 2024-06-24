package com.inkwhite.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*
         * 键盘录入一个整数，表示身上的钱
         * 如果大于等于 100 块，就是网红餐厅
         * 否则，就吃经济实惠的沙县小吃*/
        System.out.println("你现在身上还有多少钱啊？");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("网红餐厅");
        } else {
            System.out.println("沙县小吃");
        }
    }
}
