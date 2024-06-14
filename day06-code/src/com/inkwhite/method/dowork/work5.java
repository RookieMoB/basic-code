package com.inkwhite.method.dowork;
//键盘录入一个正整数
//定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
//在main方法中打印该数字是几位数
//演示格式如下:
//(1)演示一:
//	请输入一个整数:1234
//	控制台输出:1234是4位数字
//(2)演示二:
//	请输入一个整数:34567
//	控制台输出:34567是5位数字
public class work5 {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 34567;
        System.out.println(num1 + "是" + getCount(num1) + "位数");
        System.out.println(num2 + "是" + getCount(num2) + "位数");
    }

    public static int getCount(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
}
