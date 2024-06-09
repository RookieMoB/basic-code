package com.inkwhite.looptest;

public class while_test2 {
    public static void main(String[] args) {
        /*
        * 世界上最高山峰是珠穆朗玛峰（8844.43 = 8844430毫米）
        * 假如我有一张足够大的纸，他的厚度是0.1毫米
        * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度*/
        double mountains = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= mountains) {
            paper += paper;
            // 或者可以
            // paper *= 2;
            count++;
        }
        System.out.println("需要折叠 " + count + " 次");
    }
}
