package com.inkwhite.stringtest;
// 字符串反转

import java.util.Scanner;

//定义一个方法，实现字符串反转。
//建盘录入一个字符串，调用该方法后，在控制台输出结果
//列如，键盘录入abc,输出结果cba
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串 :");
        String str = sc.next();
        System.out.println("字符串反转后的结果为 :");
        reversal(str);
    }

    public static void reversal(String str) {
        String new_str = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            new_str += str.charAt(i);
        }
        System.out.println(new_str);
    }

}
