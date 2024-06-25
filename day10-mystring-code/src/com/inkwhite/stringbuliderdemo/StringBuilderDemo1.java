package com.inkwhite.stringbuliderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str += "abc";
        }
        System.out.println(str);
    }
}
