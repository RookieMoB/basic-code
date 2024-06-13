package com.inkwhite.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // 结束指定位置循环
//            if (i != 3) {
//                System.out.println("第 " + i + " 个包子");
//            }
            // 或者可以
            if (i == 3) {
                continue;
            }
            System.out.println("第 " + i + " 个包子");
        }
    }
}
