package com.inkwhite.test;

//编写女朋友类，创建女朋友类的对象
//给女朋友的属性赋值并调用女朋友类中的方法。
//自己思考，女朋友类中有哪些属性，有哪些行为？
public class GFriend {
    // 成员变量
    String name;
    private int age;

    // 构造函数
    public GFriend(){
        System.out.println("空参构造");
    }
    public GFriend(int age, String name) {
        System.out.println("带参构造");
    }

    // 成员方法
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("这恐怕不合规矩");
        }
    }
    public int getAge() {
        return this.age;
    }
    public void can() {
        System.out.println("可以做饭");
    }
}
