package com.inkwhite.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner("-|-");
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj1);


        StringJoiner sj2 = new StringJoiner("-|-", "|-", "-|");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2);
    }
}
