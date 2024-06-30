package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/29 20:55
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class demo {
    public static void main(String[] args) {
        Teacher t = new Teacher(29, "ss");
        Student s = new Student(19, "aa");
        Admin a = new Admin(39, "ww");

        show(t);
        show(s);
        show(a);
    }

    public static void show(Person p) {
        p.show();
    }
}
