package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/29 20:53
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class Student extends Person {
    public Student() {
    }

    public Student(int age, String name) {
        super(age, name);
    }

    public void show() {
        System.out.println(getAge() + ", " + getName());
    }
}
