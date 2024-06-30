package com.inkwhite.dowork;

import java.util.ArrayList;

//现有如下字符串元素：
// ["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]
// 请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。
public class work1 {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
        ArrayList<String> list_arr = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list_arr.add(str[i]);
        }

        for (String string : list_arr) {
            System.out.println(string);
        }
    }
}
