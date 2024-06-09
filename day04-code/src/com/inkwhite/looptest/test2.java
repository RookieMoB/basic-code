package com.inkwhite.looptest;

// 在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环
public class test2 {
    public static void main(String[] args) {
        // 求 1 ~ 5 之间的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1 ~ 5 之间的和 sum = " + sum);
    }
}
