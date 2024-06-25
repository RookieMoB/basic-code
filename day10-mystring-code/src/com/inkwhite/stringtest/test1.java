package com.inkwhite.stringtest;

import java.util.Random;

// 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
// (不考虑其他字符)
public class test1 {
    public static void main(String[] args) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        char[] c = new char[10];
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(str.length() + 1);
            c[i] = str.charAt(index);
        }
        int num_count = 0;
        int small_count = 0;
        int big_count = 0;
        String new_str = "";
        for (int i = 0; i < c.length; i++) {
            new_str += c[i];
            if (c[i] >= 48 && c[i] <= 57) {
                num_count++;
            }
            if (c[i] >= 65 && c[i] <=90) {
                big_count++;
            }
            if (c[i] >= 97 && c[i] <= 122) {
                small_count++;
            }
        }
        System.out.println("经统计 : " + new_str + " 中的 数字 有 : " + num_count + " 个 " +
                "小写字母有 : " + small_count + " 个 大写字母有 : " + big_count + " 个");
    }
}
