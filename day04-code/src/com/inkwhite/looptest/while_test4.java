package com.inkwhite.looptest;

/*
* 给定两个整数，被除数和除数（都是正数，且不超过int的范围）
* 将两数相除，要求不使用乘法、除法和 % 运算符
* 得到商和余数*/

import java.util.Scanner;

public class while_test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入被除数和除数");
        int dividend = sc.nextInt();   // 被除数100
        int divisor = sc.nextInt();    // 除数10
        int consult = 0;                // 商
        int remainder = 0;              // 余数
        while(dividend != 0 && dividend > divisor) {
            dividend -= divisor;
            consult++;
        }
        if (dividend != 0) {
            remainder = dividend;
        }
        System.out.println("商 " + consult);
        System.out.println("余数 " + remainder);
    }
}
