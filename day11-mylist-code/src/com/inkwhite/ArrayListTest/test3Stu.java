package com.inkwhite.ArrayListTest;
//定义一个集合，添加一些学生对象，并进行遍历
//学生类的属性为：姓名，年龄。


public class test3Stu {
    private String name;
    private  int age;


    public test3Stu() {
    }

    public test3Stu(String name, int age) {
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

    public void showInfo() {
        System.out.println("姓名为 : " + getName() + " 年龄为 : " + getAge());
    }
}
