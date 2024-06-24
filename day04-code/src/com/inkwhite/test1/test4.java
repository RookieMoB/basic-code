package com.inkwhite.test1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*
        * 商场都会有 VIP 的会员制，根据不同的会员会有不同的折扣
        * 假设商品总价为 1000
        * 键盘录入会员级别，病计算出实际支付的钱
        * 会员 1 级：打 9 折
        * 会员 2 级：打 8 折
        * 会员 3 级：打 7 折
        * 非会员：不打折，要打也是打骨折*/
        System.out.println("请输入您的会员级别 :");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        double all_price = 1000;
        if (grade == 1) {
            all_price *= 0.9;
            System.out.println("您的会员等级为 : " + grade + " 享受 9 折优惠 " + " 折后价为 : " + all_price);
        } else if (grade == 2) {
            all_price *= 0.8;
            System.out.println("您的会员等级为 : " + grade + " 享受 8 折优惠 " + " 折后价为 : " + all_price);
        } else if (grade == 3) {
            all_price *= 0.7;
            System.out.println("您的会员等级为 : " + grade + " 享受 7 折优惠 " + " 折后价为 : " + all_price);
        } else if (grade == 0) {
            System.out.println("由于您不是会员，并不享受折后价，此次消费为 :  " + all_price);
        } else {
            System.out.println("输入的会员级别不合法");
        }
    }
}
