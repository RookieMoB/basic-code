package com.inkwhite.ArrayListTest;

import java.util.ArrayList;

//需求：
//1,main方法中定义一个集合，存入三个用户对象。
//用户属性为：id,username,password
//2,要求：定义一个方法，根据引d查找对应的用户信息。
//如果存在，返回true
//如果不存在，返回false
public class test5UserTest {
    public static void main(String[] args) {
        ArrayList<test5User> users = new ArrayList<>();
        test5User user1 = new test5User(1, "user1", 230);
        test5User user2 = new test5User(2, "user2", 430);
        test5User user3 = new test5User(3, "user3", 630);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        boolean exist = isExist(users, 22);
        System.out.println(exist ? "存在" : "不存在");
    }

    public static boolean isExist(ArrayList<test5User> users, int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
