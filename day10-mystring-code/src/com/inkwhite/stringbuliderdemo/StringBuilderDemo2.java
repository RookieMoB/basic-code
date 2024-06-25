package com.inkwhite.stringbuliderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            str.append("abc");
        }
        System.out.println(str);
    }
}
