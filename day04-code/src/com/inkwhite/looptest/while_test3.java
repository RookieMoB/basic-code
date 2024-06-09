package com.inkwhite.looptest;

import java.util.Scanner;

// 回文数
public class while_test3 {
    public static void main(String[] args) {
        /*
         * 给你一个整数 x
         * 如果 x 是一个回文整数，打印true，否则，返回false
         * 解释：回文数指针正序（从左向右）和倒序（从右向左）读都是一样的整数
         * 例如：121是回文，而123不是*/
        System.out.println("请输入一个数字 : ");
        Scanner sc = new Scanner(System.in);
        int curr_cin = sc.nextInt();
        int palindromes = curr_cin;
        int count = 1;
        // 判断一共有几位数
        while ((palindromes /= 10) != 0) {
            count++;
        }
        palindromes = curr_cin;
        int ge = palindromes % 10;
        int shi = palindromes / 10 % 10;
        int bai = palindromes / 100 % 10;
        int qian = palindromes / 1000 % 10;
        switch (count) {
            case 0, 1, 2 -> System.out.println("不符合回文数的初始条件");
            case 3 -> {
                if (ge == bai) {
                    System.out.println("该数是回文数");
                } else {
                    System.out.println("该数不是回文数");
                }
            }
            case 4 -> {
                if (ge == qian) {
                    if (shi == bai) {
                        System.out.println("该数是回文数");
                    } else {
                        System.out.println("该数不是回文数");
                    }
                } else {
                    System.out.println("该数不是回文数");
                }
            }
        }
    }
}
