package com.inkwhite.demo2;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 8:56
 * @Version: v1.0.0
 * @Description: 3.定义Person类//饲养员
 * 属性：
 * 姓名，年龄
 * 行为：
 * keepPet(Dog dog,String something)方法
 * 功能：喂养宠物狗，something表示喂养的东西
 * 行为：
 * keepPet(Cat cat,String something)方法
 * 功能：喂养宠物猫，something表示喂养的东西
 * 生成空参有参构造，set和get方法
 **/
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        String type = "🐶";
        if (animal instanceof Dog d) {
        } else if (animal instanceof Cat c) {
            type = "🐱";
        } else {
            System.out.println("不存在该类型，转换失败");
        }
        System.out.println("年龄为 " + age + " 岁的 " + name + "养了一只 " + animal.getColor() + " 颜色的 " + animal.getAge() + "岁 的 " + type);
        System.out.println(animal.getAge() + " 岁的 " + animal.getColor() + " 颜色的 " + type +" 两只前腿死死的(づ′▽`)づ " + something + " 猛吃");
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
