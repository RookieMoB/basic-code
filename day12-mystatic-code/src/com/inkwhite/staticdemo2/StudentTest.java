package com.inkwhite.staticdemo2;

import java.util.ArrayList;

//需求：定义一个集合，用于存储3个学生对象。
//学生类的属性为：name、age、gender
//定义一个工具桊，用于获取集合中最大学生的年龄。
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 28, "女");
        Student s3 = new Student("王五", 38, "男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = Utils.getMaxAge(list);
        System.out.println(maxAge);
    }
}
