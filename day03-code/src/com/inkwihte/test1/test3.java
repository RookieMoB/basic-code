package com.inkwihte.test1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*
           *  数字 6 是一个真正伟大的数字，键盘录入了两个整数
           * 如果其中一个为 6 ，最终结果输出 true
           * 如果他们的和为 6 的倍数，最终结果输出为 true
           * 其他情况都是false
        */
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0);
    }
}
