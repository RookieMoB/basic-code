package com.inkwhite.ArrayListTest;

import java.util.ArrayList;

//需求：定义一个集合，添加字符串，并进行遍历
//遍历格式参照：[元素1，元素2，元素3]。
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list_str = new ArrayList<>();
        list_str.add("e1");
        list_str.add("e2");
        list_str.add("e3");

        System.out.println(list_str);

        System.out.print("[");
        for (int i = 0; i < list_str.size(); i++) {
            if (i == list_str.size() - 1) {
                System.out.print(list_str.get(i));
            } else {
                System.out.print(list_str.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
