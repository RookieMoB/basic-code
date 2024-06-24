package com.inkwhite.test5;

import java.util.Scanner;

//定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//学生的属性：学号，姓名，年龄。
//要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//要求2：添加完毕之后，遍历所有学生信息。
//要求3：通过id删除学生信息
//如果存在，则删除，如果不存在，则提示删除失败。
//要求4：删除完毕之后，遍历所有学生信息。
//要求5：查询数组id为"heima002”的学生，如果存在，则将他的年龄+1岁
public class StudentTest {
    public static void main(String[] args) {
        //定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        Student[] stus = new Student[4];

        Student s1 = new Student(20230046, "InkWhite", 24);
        Student s2 = new Student(20230047, "ink", 20);
        Student s3 = new Student(20230048, "white", 18);

        stus[0] = s1;
        stus[1] = s2;
        stus[2] = s3;

        // 创建 标识位 判断是否可以添加
        boolean isAdd = true;
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student s4 = new Student(20230049, "hello", 28);
        for (int i = 0; i < stus.length - 1; i++) {
            if (s4.getStu_id() == stus[i].getStu_id()) {        // 判断新添加的学生id是否存在于之前的数组中
                System.out.println("新添加的学生 id 已经存在");
                isAdd = false;
                break;
            } else {
                System.out.println("与第 " + (i + 1) + " 个学生 id 不一致，可添加");
            }
        }

        if (isAdd) {        // 如果根据检测没有和之前的学生的 id 一致的，显示可以添加
            stus[3] = s4;
            System.out.println("添加成功");
        }
        //要求2：添加完毕之后，遍历所有学生信息。
        for (int i = 0; i < stus.length; i++) {
            stus[i].showInfo();
        }
        //要求3：通过id删除学生信息
        // 创建一个标识位用于判断是否删除当前id的学生信息
        boolean isDel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行删除的学生的 id :");
        int del_id = sc.nextInt();
        int print_is = 0;
        while (true) {
            System.out.println("是否确认进行删除，该操作不可逆，1 表示确认，0 表示取消");
            print_is = sc.nextInt();
            if (print_is == 1) {        // 如果输入的是 1 ，之后的操作才可以继续执行
                isDel = true;
                break;
            } else if (print_is == 0) {
                System.out.println("已取消当前操作");
                break;
            } else {
                System.out.println("错误操作，请重新进行输入 :");
            }
        }

        // 进行删除操作
        //如果存在，则删除，如果不存在，则提示删除失败。
        if (isDel) {
            for (int i = 0; i < stus.length; i++) {
                System.out.println("stus[i].getStu_id() = " + stus[i].getStu_id());
                System.out.println("print_is = " + del_id);
                if (stus[i].getStu_id() == del_id) {      // 如果输入的学生id存在与之前的学生数组内，进行删除
                    stus[i].setStu_id(0);
                    stus[i].setStu_name("");
                    stus[i].setStu_age(0);
                    System.out.println("删除成功");
                    break;
                } else {        // 进行提示，该学生的id 不存在于学生数组内
                    System.out.println("该学生的 id 不存在于学生数组内");
                }
            }
        }

        //要求4：删除完毕之后，遍历所有学生信息。
        for (Student student : stus) {
            student.showInfo();
        }
        //要求5：查询数组id为"heima002”的学生，如果存在，则将他的年龄+1岁
        for (Student student : stus) {
            System.out.println("之前的学生的年龄为 : " + student.getStu_age());
        }
        for (Student student : stus) {
            if (student.getStu_id() == 20230047) {
                student.setStu_age(student.getStu_age() + 1);
            }
        }
        for (Student student : stus) {
            System.out.println("之后的学生的年龄为 : " + student.getStu_age());
        }
    }
}
