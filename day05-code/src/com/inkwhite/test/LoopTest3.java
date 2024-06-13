package com.inkwhite.test;
import java.util.Scanner;
// 求质数
//键盘录入一个正整数X，判断该整数是否为一个质数。
public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数 进行判断是否为质数");
        int prime_number = sc.nextInt();
        boolean isPrime = false;
        // 写一个循环，从 2 开始，到 prime_number - 1 结束
        for (int i = 2; i < prime_number; i++) {
            // 看 prime_number 是否可以被 i 整除
            if (prime_number % i == 0) {
                System.out.println("prime_number 可以被 " + i + " 整除");
                isPrime = true;
                break;
            }
        }
        if (isPrime) {
            System.out.println(prime_number + " : 🔟🈴🐭");
        } else {
            System.out.println(prime_number + " : 🔟📄🐭");
        }
    }
}
