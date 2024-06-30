package com.inkwhite.dowork;
// 在传智教育的tlias教学资源管理系统中，存在学生、老师角色会进入系统。
// 学生信息和行为（名称，年龄，所在班级，查看课表，填写听课反馈fillForm）
// 老师信息和行为（名称，年龄，部门名称，查看课表，发布问题publishForm）
// 定义角色类作为父类包含属性（名称，年龄），行为（查看课表）
// 定义子类：学生类包含属性（所在班级），行为（填写听课反馈）
// 定义子类：老师类包含属性（部门名称），行为（发布问题）
public class Role {
    private String name;
    private int age;

    public Role() {
    }

    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void action() {
        System.out.println("查看课表");
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
        return "Role{name = " + name + ", age = " + age + "}";
    }
}