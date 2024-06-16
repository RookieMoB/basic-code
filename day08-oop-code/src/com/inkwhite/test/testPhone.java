package com.inkwhite.test;

public class testPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.name = "华为";
        p.price = 3999.99;
        System.out.println("手机型号 : " + p.name + " 限时秒杀 : " + p.price);
        p.call();
        p.playGames();
    }
}
