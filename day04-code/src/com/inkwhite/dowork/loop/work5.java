package com.inkwhite.dowork.loop;

/*
 * 需求：
 * 给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。
 * 将两数相除，要求不使用乘法、除法和 % 运算符。
 * 得到商和余数。*/
public class work5 {
    public static void main(String[] args) {
        int dividend = 10;   // 被除数
        int temp = dividend; // 临时存储被除数，使其不会被修改
        int divisor = 3;    // 除数
        int quotient = 0;   // 商
        int remainder = 0;  // 余数
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        remainder = dividend;

        System.out.println(temp + " / " + divisor + " = " + quotient + " ··· " + remainder);
    }
}
