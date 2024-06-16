package com.inkwhite.test;

public class GFriendTest {
    public static void main(String[] args) {
        GFriend gf = new GFriend();
        gf.setAge(18);
        gf.name = "仓";
        System.out.println("年龄为 : " + gf.getAge() + " 姓名为 : " + gf.name);
        gf.can();

        GFriend gf1 = new GFriend();
        GFriend gf2 = new GFriend(19, "lisi");
    }
}
