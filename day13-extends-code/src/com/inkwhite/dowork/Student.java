package com.inkwhite.dowork;
// 在传智教育的tlias教学资源管理系统中，存在学生、老师角色会进入系统。
// 学生信息和行为（名称，年龄，所在班级，查看课表，填写听课反馈fillForm）
// 老师信息和行为（名称，年龄，部门名称，查看课表，发布问题publishForm）
// 定义角色类作为父类包含属性（名称，年龄），行为（查看课表）
// 定义子类：学生类包含属性（所在班级），行为（填写听课反馈）
// 定义子类：老师类包含属性（部门名称），行为（发布问题）
public class Student extends Role {
    private int stu_class;

    public Student() {
    }

    public Student(String name, int age, int stu_class) {
        super(name, age);
        this.stu_class = stu_class;
    }

    @Override
    public void action() {
        super.action();
        System.out.println("发布问题");
    }

    /**
     * 获取
     * @return stu_class
     */
    public int getStu_class() {
        return stu_class;
    }

    /**
     * 设置
     * @param stu_class
     */
    public void setStu_class(int stu_class) {
        this.stu_class = stu_class;
    }

    public String toString() {
        return "Student{stu_class = " + stu_class + "}";
    }

    public void showInfo() {
        System.out.println(getAge() + ", " + getName() + ", " + getStu_class());
    }
}
