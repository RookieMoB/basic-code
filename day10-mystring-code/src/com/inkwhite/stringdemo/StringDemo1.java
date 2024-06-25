package com.inkwhite.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("aBc");

        boolean isEqual = s1.equalsIgnoreCase(s2);  // 忽略大小写
//        boolean isEqual = s1.equals(s2);  // 不忽略大小写
        if (isEqual) {
            System.out.println("两个字符串相等");
        } else {
            System.out.println("两个字符串不相等");
        }
    }
}
