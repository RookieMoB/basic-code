package com.inkwhite.dohomework;
//请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
public class work4 {
    public static void main(String[] args) {
        String s1 = "abcba";
        String s2 = "上海自来水来自海上";

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            sb1.append(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            sb2.append(s2.charAt(i));
        }

        if (sb1.reverse().toString().equals(s1)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }
        if (sb2.reverse().toString().equals(s2)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }
    }
}
