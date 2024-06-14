package com.inkwhite.method.dowork;
//定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class work1 {
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = 2.22;
        System.out.println(num1 + " 和 " + num2 + " 中较小的值为 : " + retMin(num1, num2));
    }

    public static double retMin(double num1, double num2) {
        return num1 < num2 ? num1 : num2;
    }
}
