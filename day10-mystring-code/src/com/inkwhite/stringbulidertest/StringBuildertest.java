package com.inkwhite.stringbulidertest;
//键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
//对称字符串：123321、111
//非对称字符串：123123
public class StringBuildertest {
    public static void main(String[] args) {
        String s1 = "123321";
        StringBuilder sb1 = new StringBuilder("123321");
        String s2 = "111";
        StringBuilder sb2 = new StringBuilder("111");
        String s3 = "123123";
        StringBuilder sb3 = new StringBuilder("123123");

        Symmetry(sb1, s1);
        Symmetry(sb2, s2);
        Symmetry(sb3, s3);
    }

    public static void Symmetry(StringBuilder sb, String s) {
        if (sb.reverse().toString().equals(s)) {
            System.out.println("字符串 " + s + " 是对称字符串");
        } else {
            System.out.println("字符串 " + s + " 不是对称字符串");
        }
    }
}
