package com.inkwhite.random.test;

import java.util.Random;
import java.util.Scanner;

//需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
// 现在添加需求，够三次之后，必猜中
public class test1 {
    public static void main(String[] args) {
        // 创建随机数对象
        Random r = new Random();
        // 创建输入对象
        Scanner sc = new Scanner(System.in);
        int sc_num = 0;
        // 生成 1 ~ 100 之间的随机数
        int r_num = r.nextInt((100 + 1) - 1) + 1;
        System.out.println("生成的随机数为 : " + r_num);
        int count = 0;      // 判断当前是第几次猜
        while (true) {
            count++;
            System.out.println("请输入您猜测的数字 :");
            sc_num = sc.nextInt();
            if (count == 3) {
                System.out.println("恭喜你，猜对了");
                break;
            }
            if (sc_num == r_num) {
                System.out.println("恭喜你，猜对了");
                break;
            } else if (sc_num > r_num) {
                System.out.println("不好意思，猜大了");
            } else if (sc_num < r_num) {
                System.out.println("不好意思，猜小了");
            }
        }
    }
}
