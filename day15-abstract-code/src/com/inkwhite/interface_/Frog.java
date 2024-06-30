package com.inkwhite.interface_;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 11:16
 * @Version: v1.0.0
 * @Description:
 * 青蛙frog      属性：名字，年龄   行为：吃虫子，蛙泳
 * 狗dog        属性：名字，年龄   行为：吃骨头，狗刨
 * 兔子rabbit   属性：名字，年龄   行为：吃胡萝卜
 **/
public class Frog extends Animal implements interface__ {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + " 岁的 " + getName() + " 🐸 在吃 🐛");
    }


    @Override
    public void swim() {
        System.out.println(getAge() + " 岁的 " + getName() + " 🐸 在 🏊‍♀️");
    }
}
