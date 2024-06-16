package com.inkwhite.test;
// 找质数
//判断101-200之间有多少个素数，并输出所有素数。
public class test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;     // 默认为素数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {   // 合数
                    isPrime = false;
                    break;      // 如果是合数，跳出当前循环
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("共有 " + count + " 个素数");
    }
}
