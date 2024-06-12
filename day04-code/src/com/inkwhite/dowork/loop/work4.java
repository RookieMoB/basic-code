package com.inkwhite.dowork.loop;

/*
 * 需求：给你一个整数 x 。
 * 如果 x 是一个回文整数，打印 true ，否则，返回 false 。
 * 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。*/

public class work4 {
    public static void main(String[] args) {
        int x = 123;
        int temp = x;
        int total = 0;
        int flag = 0;
        while (x != 0) {
            flag = x % 10;
            total = total * 10 + flag;
            x /= 10;
        }
        if (total == temp) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
