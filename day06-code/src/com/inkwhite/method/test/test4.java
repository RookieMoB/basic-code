package com.inkwhite.method.test;
// 基本数据类型的按值传递
public class test4 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num);
        num = getChange(num);
        System.out.println(num);
    }

    public static int getChange(int num) {
        num = 200;
        return num;// 想要修改实参的值，必须通过 return 将修改后的值返回给调用处
    }
}
