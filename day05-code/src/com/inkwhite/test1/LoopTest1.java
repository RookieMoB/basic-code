package com.inkwhite.test1;

/*
* 朋友聚会的时候可能会玩一个游戏：逢7过
游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍
数时都要说过：过
需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/
public class LoopTest1 {
    public static void main(String[] args) {
        int ge = 0;
        int shi = 0;
        for (int i = 1; i < 100; i++) {
            ge = i % 10;
            shi = i / 10 % 10;
            if (i % 7 == 0 || ge == 7 || shi == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
