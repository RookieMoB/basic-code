package com.inkwhite.dowork;
// 在传智教育的tlias教学资源管理系统中，存在学生、老师角色会进入系统。
// 学生信息和行为（名称，年龄，所在班级，查看课表，填写听课反馈fillForm）
// 老师信息和行为（名称，年龄，部门名称，查看课表，发布问题publishForm）
// 定义角色类作为父类包含属性（名称，年龄），行为（查看课表）
// 定义子类：学生类包含属性（所在班级），行为（填写听课反馈）
// 定义子类：老师类包含属性（部门名称），行为（发布问题）
public class Teacher extends Role {
    private String department_name;

    public Teacher() {
    }

    public Teacher(String name, int age, String department_name) {
        super(name, age);
        this.department_name = department_name;
    }

    @Override
    public void action() {
        super.action();
        System.out.println("填写听课反馈");
    }

    /**
     * 获取
     * @return department_name
     */
    public String getDepartment_name() {
        return department_name;
    }

    /**
     * 设置
     * @param department_name
     */
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String toString() {
        return "Teacher{department_name = " + department_name + "}";
    }

    public void showInfo() {
        System.out.println(getAge() + ", " + getName() + ", " + getDepartment_name());
    }
}
