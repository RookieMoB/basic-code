package com.inkwhite.test;

import java.util.Scanner;

/*
求平方根
* 需求：键盘录入一个大于等于2的整数X,计算并返回X的平方根
结果只保留整数部分，小数部分将被舍去*/
public class LoopTest2 {
    public static void main(String[] args) {
        System.out.println("请输入一个数，进行平方根的运算");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = 1;
        while (index * index <= num) {
            index++;
        }
        System.out.println(num + " 的平方根为 : " + (index - 1));
    }
}
