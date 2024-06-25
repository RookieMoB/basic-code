package com.inkwhite.stringtest;

import java.util.Scanner;

// 小写金额转大写
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的消费金额 :");
        int money;
        while (true) {
            money = sc.nextInt();
            // 合法校验
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("不合法金额");
            }
        }

        // 将输入的金额分割为一个一个的数字进行大写转换
        String str_money = "";
        while (money != 0) {
            int num = money % 10;
            str_money = toBigNum(num) + str_money;
            money /= 10;
        }

        // 不满 7 位的时候进行补全
        int count = 7 - str_money.length();
        for (int i = 0; i < count; i++) {
            str_money = toBigNum(0) + str_money;
        }

        // 为获取到的大写金额添加单位
        String[] units = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
//        for (int i = str_money.length() - 1; i >= 0 ; i--) {
//            result = str_money.charAt(i) + units[i] + result;
//        }
        for (int i = 0; i < str_money.length() ; i++) {
            result += str_money.charAt(i) + units[i];
        }
        System.out.println("您的消费金额转换为大写之后为 :");
        System.out.println(result);
    }

    public static String toBigNum(int num) {
        String[] big_num = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
        return big_num[num];
    }
}
