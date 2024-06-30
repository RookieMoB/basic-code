package com.inkwhite.ArrayListTest;

import java.util.ArrayList;

//需求：定义一个集合，添加字符串，并进行遍历
//遍历格式参照：[元素1，元素2，元素3]。
public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list_int = new ArrayList<>();

        list_int.add(1);
        list_int.add(2);
        list_int.add(3);

        System.out.print("[");
        for (int i = 0; i < list_int.size(); i++) {
            if (i == list_int.size() - 1) {
                System.out.print(list_int.get(i));
            } else {
                System.out.print(list_int.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
