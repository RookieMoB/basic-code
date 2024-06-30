package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 10:42
 * @Version: v1.0.0
 * @Description:
 * 编写带有抽象类的Javabean类
 * 青蛙frog   属性：名字，年龄   行为：吃虫子，喝水
 * 狗Dog     属性：名字，年龄   行为：吃骨头，喝水
 * 山羊Sheep 属性：名字，年龄   行为：吃艹，喝水
 **/
public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();

    public void drink() {
        System.out.println("喝水");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
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

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}
