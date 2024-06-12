package com.inkwhite.dowork.mif;

public class work01 {
    public static void main(String[] args) {
        /*
        * 李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
        * 而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，
        * 新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？
        * 请在控制台输出。*/
        double phone_price = 7988;
        double old_phone = 1500;
        double scheme_one = phone_price - old_phone;
        double scheme_second = phone_price * 0.8;
        System.out.println("第一种结果写法⬇️");
        if (scheme_one > scheme_second) {
            System.out.println("不进行以旧换新");
        } else {
            System.out.println("进行以旧换新");
        }
        System.out.println("第二种结果写法⬇️");
        System.out.println(scheme_one > scheme_second ? "不进行以旧换新" : "进行以旧换新");
        System.out.println("以旧换新的价格为 : " + scheme_second);
        System.out.println("不以旧换新的价格为 : " + scheme_one);
    }
}
