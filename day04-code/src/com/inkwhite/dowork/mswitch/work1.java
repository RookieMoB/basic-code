package com.inkwhite.dowork.mswitch;

import java.util.Scanner;

/*
* 模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
要求：
键盘录入三个整数,其中前两个整数代表参加运算的数据，
* 第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
	请输入第一个整数: 30
	请输入第二个整数: 40
	请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
	控制台输出:30+40=70*/
public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入要进行的运算「\n\t1:表示加法\n\t2:表示减法\n\t3:表示乘法\n\t4:表示除法」");
        int flag = sc.nextInt();
        int result = 0;
        switch (flag) {
            case 1 -> {     // +
                result = num1 + num2;
            }
            case 2 -> {     // -
                result = num1 - num2;
            }
            case 3 -> {     // *
                result = num1 * num2;
            }
            case 4 -> {     // /
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("除数不能为 0");
                }

            }
            default -> {    // 输入错误
                System.out.println("输入有误，已退出");
            }
        }
        System.out.println("计算结果为 : " + result);
    }
}
