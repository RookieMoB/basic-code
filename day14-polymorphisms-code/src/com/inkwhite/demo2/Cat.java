package com.inkwhite.demo2;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 8:54
 * @Version: v1.0.0
 * @Description:
 * 2.定义猫类
 * 		属性：
 * 			年龄，颜色
 * 		行为:
 * 			eat(String something)方法(something表示吃的东西)
 * 			逮老鼠catch
 **/
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat(String something) {
        System.out.println("🐱正在吃 : " + something);
    }

    public void catchMouse() {
        System.out.println("🐱正在逮老鼠");
    }
}
