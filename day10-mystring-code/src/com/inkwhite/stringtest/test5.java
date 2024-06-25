package com.inkwhite.stringtest;
// substring
public class test5 {
    public static void main(String[] args) {
        String phone_num = "18832311745";
        String begin_str = phone_num.substring(0, 3);
        String end_str = phone_num.substring(7);
        String new_phone_num = begin_str + "****" + end_str;
        System.out.println(new_phone_num);
    }
}
