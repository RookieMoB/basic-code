package com.inkwhite.stringbuliderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("444").append(1).append(1.25).append(true).reverse();

        System.out.println(sb);

        // 变回字符串
        String string = sb.toString();
        System.out.println(string);
    }
}
