package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/29 20:54
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class Admin extends Person {
    public Admin(int age, String name) {
        super(age, name);
    }

    public Admin() {
    }

    public void show() {
        System.out.println(getAge() + ", " + getName());
    }
}
