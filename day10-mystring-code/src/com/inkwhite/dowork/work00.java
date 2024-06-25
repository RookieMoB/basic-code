package com.inkwhite.dowork;

import java.util.Scanner;

//键盘录入一个字符串，
//要求1：长度为小于等于9
//要求2：只能是数字
//将内容变成罗马数字
//下面是阿拉伯数字跟罗马数字的对比关系：
//1-1、Il-2、IIl-3、V-4、V-5、V1-6、V川-7、VlⅧ-8、IX-9
//注意点：
//罗马数字里面是没有0的
//如果键盘录入的数字包含0，可以变成“ ”（长度为0的字符串)
public class work00 {
    public static void main(String[] args) {
        System.out.println("请输入一串数字，他将会以罗马数字的形式进行展示(范围为1 ~ 9)「0 将以 \" \" 的形式进行展示」「不能以 0 开头」");
        Scanner sc = new Scanner(System.in);
        int num_str = sc.nextInt();
        String cur_str = "";
        while (num_str != 0) {
            int num = num_str % 10;
            cur_str = numToRomanNum(num) + cur_str;
            num_str /= 10;
        }
        System.out.println(cur_str);
    }

    public static String numToRomanNum(int num) {   // 用于将用户输入的数字转换为罗马数字的函数
        // 定义一个存放罗马数字的数组
        String[] roman_numerals = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return roman_numerals[num];
    }

    // 第二种思路
    public static String numToRomanNum(char num) {   // 用于将用户输入的数字转换为罗马数字的函数
        // 定义一个存放罗马数字的数组
        String str = switch (num) {
            case '0' -> " ";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "烫";
        };
        return str;
    }
}
