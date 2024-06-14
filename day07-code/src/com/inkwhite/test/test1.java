package com.inkwhite.test;

import java.util.Scanner;

//机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
//按照如下规则计算机票价格：旺季（5-10月)头等舱9折，经济舱8.5折，
//                       淡季（11月到来年4月)头等舱7折，经济舱6.5折。
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价 :");
        double original_price = sc.nextDouble();
        System.out.println("请输入当前月份 :");
        int month = sc.nextInt();
        System.out.println("1 代表头等舱\n0 代表经济舱");
        int type = sc.nextInt();
        double curr_price = currPrice(original_price, month, type);
        if (curr_price == -1) {
            System.out.println("👋");
        } else {
            System.out.println("根据您输入的信息，现推断，你需要支付 " + curr_price + " 元。");
        }
    }

    public static double currPrice(double original_price, int month, int type) {
        double discount = 0.0;
        boolean isSlackSeason = false;
        switch (month) {
            case 5, 6, 7, 8, 9, 10 -> {     // 旺季
                discount = calculateDiscount(type, isSlackSeason);
            }
            case 1, 2, 3, 4, 11, 12 -> {    // 淡季
                isSlackSeason = true;
                discount = calculateDiscount(type, isSlackSeason);
            }
            default -> {
                System.out.print("你怕不是个👽");
                return -1;
            }
        }
        return original_price * discount;
    }

    public static double calculateDiscount(int type, boolean isSlackSeason) {
        double discount = 0.0;

        if (!isSlackSeason) {       // 旺季
            if (type == 1) {        // 头等舱  0.9
                discount = 0.9;
                return discount;
            } else if (type == 0) { // 经济舱  0.85
                discount = 0.85;
                return discount;
            } else {
                System.out.print("你怕不是个👽");
                return -1;
            }
        } else {                    // 淡季
            if (type == 1) {        // 头等舱  0.7
                discount = 0.7;
                return discount;
            } else if (type == 0) {                // 经济舱  0.65
                discount = 0.65;
                return discount;
            } else {
                System.out.print("你怕不是个👽");
                return -1;
            }
        }
    }
}
