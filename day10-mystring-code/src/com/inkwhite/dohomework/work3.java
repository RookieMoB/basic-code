package com.inkwhite.dohomework;
//请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
public class work3 {
    public static void main(String[] args) {
        String str = "Hello12345World";
        char[] str_c = str.toCharArray();
        int count = 0;      // 用于统计数字出现了多少次
        for (int i = 0; i < str_c.length; i++) {
            if (str_c[i] >= '0' && str_c[i] <= '9') {
                count++;
            }
        }
        System.out.println("单词总长度为 " + str.length());
        System.out.println("数字出现了 " + count + " 次");
        System.out.println("字母出现了 " + (str.length() - count) + " 次");
    }
}
