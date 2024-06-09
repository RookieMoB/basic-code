package com.inkwhite.loopdemo1;

public class LoopDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("这是第 " + i + " 次循环");
        }
        System.out.println("---------------------------");
        for (int i = 5; i >= 1; i--) {
            System.out.println("这是第 " + i + " 次循环");
        }
    }
}
