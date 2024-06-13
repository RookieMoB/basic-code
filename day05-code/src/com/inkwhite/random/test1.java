package com.inkwhite.random;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        // 生成指定范围 3 ~ 5 的随机数
        Random r = new Random();
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = r.nextInt((5 + 1) - 3) + 3;
            System.out.println(num);
        }
    }
}
