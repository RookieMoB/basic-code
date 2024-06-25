package com.inkwhite.stringbuliderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abc");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijklmnopqrstuvwxyz");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijklmnopqrstuvwxyz012345678900000000000000000");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijkl000");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
