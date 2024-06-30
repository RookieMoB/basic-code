package com.inkwhite.interface_;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 11:14
 * @Version: v1.0.0
 * @Description:
 * 青蛙frog      属性：名字，年龄   行为：吃虫子，蛙泳
 * 狗dog        属性：名字，年龄   行为：吃骨头，狗刨
 * 兔子rabbit   属性：名字，年龄   行为：吃胡萝卜
 **/
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

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
