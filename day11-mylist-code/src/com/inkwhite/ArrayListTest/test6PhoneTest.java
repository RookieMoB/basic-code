package com.inkwhite.ArrayListTest;

import java.util.ArrayList;

//需求：
//定义Javabean类：Phone
//Phone属性：品牌，价格。
//main方法中定义一个集合，存入三个手机对象。
//分别为：小米，1000。苹果，8000。锤子2999。
//定义一个方法，将价格低于3000的手机信息返回。
public class test6PhoneTest {
    public static void main(String[] args) {
        ArrayList<test6Phone> phones = new ArrayList<>();

        test6Phone phone1 = new test6Phone("小米", 1000);
        test6Phone phone2 = new test6Phone("苹果", 8000);
        test6Phone phone3 = new test6Phone("锤子", 2999);

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);

        ArrayList<test6Phone> phones1 = lowPhone(phones);

        for (int i = 0; i < phones1.size(); i++) {
            System.out.println(phones1.get(i).toString());
        }
    }

    public static ArrayList<test6Phone> lowPhone(ArrayList<test6Phone> phones) {
        ArrayList<test6Phone> new_phones = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() < 3000) {
                new_phones.add(phones.get(i));
            }
        }
        return new_phones;
    }
}
