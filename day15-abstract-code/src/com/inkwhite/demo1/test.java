package com.inkwhite.demo1;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 10:55
 * @Version: v1.0.0
 * @Description:
 * 编写带有抽象类的Javabean类
 * 青蛙frog   属性：名字，年龄   行为：吃虫子，喝水
 * 狗Dog     属性：名字，年龄   行为：吃骨头，喝水
 * 山羊Sheep 属性：名字，年龄   行为：吃艹，喝水
 **/
public class test {
    public static void main(String[] args) {
        Forg f = new Forg("🐸", 2);
        Dog d = new Dog("🐶", 4);
        Sheep s = new Sheep("🐑", 6);

        f.eat();
        f.drink();
        d.eat();
        d.drink();
        s.eat();
        s.drink();
    }
}
