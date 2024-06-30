package com.inkwhite.ArrayListTest;

import java.util.ArrayList;
import java.util.Scanner;

//需求：定义一个集合，添加一些学生对象，并进行遍历
//学生类的属性为：姓名，年龄。
//要求：对象的数据来自键盘录入
public class test4StuTest {
    public static void main(String[] args) {
        ArrayList<test4Stu> stus = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        int count = 0;
        while (true) {
            System.out.println("请输入第 " + (count + 1) + " 个学生的姓名 :");
            name = sc.next();
            System.out.println("请输入第 " + (count + 1) + " 个学生的年龄 :");
            age = sc.nextInt();
            test4Stu stu = new test4Stu(name, age);
            stus.add(stu);
            count++;
            if (count == 3) {
                break;
            }
        }

        for (int i = 0; i < stus.size(); i++) {
            stus.get(i).showInfo();
        }
    }
}
