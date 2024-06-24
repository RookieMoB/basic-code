package com.inkwhite.test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
        * 假设，用户在超市实际购买，商品总价为：600元
        * 键盘录入一个整数表示用户实际支付的钱
        * 如果付款大于等于600，表示付款成功，否则付款失败*/
        int curr_shop = 600;
        System.out.println("您当前选购的商品的总价为 : " + curr_shop + "您现在身上有多少钱呢？");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money >= curr_shop) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }
    }
}
