package com.inkwhite.ArrayListTest;

import java.util.ArrayList;

//定义一个集合，添加一些学生对象，并进行遍历
//学生类的属性为：姓名，年龄。
public class test3StuTest {
    public static void main(String[] args) {
        ArrayList<test3Stu> stus = new ArrayList<>();
        test3Stu stu1 = new test3Stu("张三", 18);
        test3Stu stu2 = new test3Stu("李四", 19);
        test3Stu stu3 = new test3Stu("王五", 20);
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);

        for (int i = 0; i < stus.size(); i++) {
            stus.get(i).showInfo();
        }
    }
}
