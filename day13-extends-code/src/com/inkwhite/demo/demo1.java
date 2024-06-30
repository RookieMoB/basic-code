package com.inkwhite.demo;
//现在有四种动物：布偶猫、中国狸花猫、哈士奇、泰迪。
//暂时不考虑属性，只要考虑行为。
//请按照继承的思想特点进行继承体系的设计。
//四种动物分别有以下的行为：
//布偶猫：吃饭、喝水、抓老鼠
//中国狸花猫：吃饭、喝水、抓老鼠
//哈士奇：吃饭、喝水、看家、拆家
//泰迪：吃饭、喝水、看家、蹭一蹭
public class demo1 {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        cat1.name = "布偶猫";
        cat1.zuo();
        System.out.println();
        Cats cat2 = new Cats();
        cat2.name = "中国狸花猫";
        cat2.zuo();

        System.out.println();

        Dogs dog1 = new Dogs();
        dog1.name = "哈士奇";
        dog1.other("拆家");
        System.out.println();
        Dogs dog2 = new Dogs();
        dog2.name = "泰迪";
        dog2.other("蹭一蹭");
    }
}
