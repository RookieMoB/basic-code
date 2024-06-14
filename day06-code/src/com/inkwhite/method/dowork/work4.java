package com.inkwhite.method.dowork;
//数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
// 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
public class work4 {
    public static void main(String[] args) {
        double num1 = -3.14;
        double num2 = 3.14;
        System.out.println(num1 + " 的绝对值为 : " + retAbsoluteValue(num1));
        System.out.println(num2 + " 的绝对值为 : " + retAbsoluteValue(num2));
    }

    public static double retAbsoluteValue(double num) {
        double temp = num;
        if (num < 0) {
            temp = 0 - num;
        } else {
            return temp;
        }
        return temp;
    }
}
