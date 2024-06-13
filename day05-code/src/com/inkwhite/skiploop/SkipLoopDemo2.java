package com.inkwhite.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        // 结束整个循环
        for (int i = 1; i <= 5; i++) {
            if (i > 3) {
                break;
            }
            System.out.println("第 " + i + " 个包子");
        }
    }
}
