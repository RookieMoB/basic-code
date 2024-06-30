package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/29 20:52
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class Person {
    private int age;
    private String name;


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{age = " + age + ", name = " + name + "}";
    }

    public void show() {
        System.out.println(getAge() + ", " + getName());
    }
}
