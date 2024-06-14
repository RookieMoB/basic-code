package com.inkwhite.method.demo;
// 函数重载
// 顺序、类型、个数
public class demo7 {
    public static void main(String[] args) {
        func1(10);
        func1(10, 20);
        func1(1, 3.14, "ll");
        func1(3.14, 1, "ll");
        func1("ll", 1, 3.14);
    }

    public static void func1(int num) {
        System.out.print("h");
    }
    public static void func1(int num1, int num2) {
        System.out.print("e");
    }
    public static void func1(int num1, double num2, String str) {
        System.out.print("l");
    }
    public static void func1(double num1, int num2, String str) {
        System.out.print("l");
    }
    public static void func1(String str, int num1, double num2) {
        System.out.print("o");
    }
}
