package com.inkwhite.staticdemo2;

import java.util.ArrayList;

//需求：定义一个集合，用于存储3个学生对象。
//学生类的属性为：name、age、gender
//定义一个工具桊，用于获取集合中最大学生的年龄。
public class Utils {
    private Utils() {}

    public static int getMaxAge(ArrayList<Student> list) {
        int max = list.getFirst().getAge();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > max) {
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
