package com.inkwhite.dowork.mif;

import java.util.Scanner;

/*
* 某商场购物可以打折，具体规则如下：
普通顾客购不满100元不打折，满100元打9折；
会员购物不满200元打8折，满200元打7.5折；
不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。*/
public class work04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isVIP = false;          // 判断是否是VIP
        System.out.println("请输入您是否是会员\n1表示为VIP\t0表示非VIP");
        int flag = sc.nextInt();        // 用于判断是否为会员
        if (flag != 0) {                // VIP
            isVIP = true;
        }
        System.out.println("您的消费金额为 :");
        double price = sc.nextDouble();     // 消费金额
        double discount = 0;
        if (!isVIP) {
            if (price < 100 && price >= 0) {
                discount = 0;
            } else if (price >= 100) {
                discount = 0.9;
            }
        } else {
            if (price < 200 && price >= 0) {
                discount = 0.8;
            } else if (price >= 200) {
                discount = 0.75;
            }
        }
        double amount_payable = price * discount;
        System.out.println("根据您的会员等级以及消费金额进行计算,你需要支付 : " + amount_payable + " 元");
    }
}
