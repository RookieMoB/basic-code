package com.inkwhite.stringdemo;
// 字符串的遍历
public class StringDemp3 {
    public static void main(String[] args) {
        String str = "情之起始，心上一点";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
