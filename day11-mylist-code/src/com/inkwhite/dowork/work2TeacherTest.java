package com.inkwhite.dowork;

import java.util.ArrayList;

// 请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
// 姓名：赵老师, 专业：javase
// 姓名：钱老师, 专业：javaee
// 姓名：孙老师, 专业：php
// 姓名：李老师, 专业：python
public class work2TeacherTest {
    public static void main(String[] args) {
        ArrayList<work2Teacher> list = new ArrayList<>();
        work2Teacher tea1 = new work2Teacher("赵老师", "javase");
        work2Teacher tea2 = new work2Teacher("钱老师", "javaee");
        work2Teacher tea3 = new work2Teacher("孙老师", "php");
        work2Teacher tea4 = new work2Teacher("李老师", "python");

        list.add(tea1);
        list.add(tea2);
        list.add(tea3);
        list.add(tea4);

        for (work2Teacher teacher : list) {
            teacher.showInfo();
        }
    }
}
