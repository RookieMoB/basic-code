package com.inkwhite.demo2;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 8:52
 * @Version: v1.0.0
 * @Description: 1.定义狗类
 * 属性：
 * 年龄，颜色
 * 行为:
 * eat(String something)(something表示吃的东西)
 * 看家lookHome方法(无参数)
 **/
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat(String something) {
        System.out.println("🐶正在吃 : " + something);
    }

    public void lookHome() {
        System.out.println("🐶正在看家");
    }
}
