package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 10:54
 * @Version: v1.0.0
 * @Description:
 * 编写带有抽象类的Javabean类
 * 青蛙frog   属性：名字，年龄   行为：吃虫子，喝水
 * 狗Dog     属性：名字，年龄   行为：吃骨头，喝水
 * 山羊Sheep 属性：名字，年龄   行为：吃艹，喝水
 **/
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃🦴");
    }
}
