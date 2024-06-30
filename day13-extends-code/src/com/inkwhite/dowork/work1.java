package com.inkwhite.dowork;
// 在传智教育的tlias教学资源管理系统中，存在学生、老师角色会进入系统。
// 学生信息和行为（名称，年龄，所在班级，查看课表，填写听课反馈fillForm）
// 老师信息和行为（名称，年龄，部门名称，查看课表，发布问题publishForm）
// 定义角色类作为父类包含属性（名称，年龄），行为（查看课表）
// 定义子类：学生类包含属性（所在班级），行为（填写听课反馈）
// 定义子类：老师类包含属性（部门名称），行为（发布问题）
public class work1 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 18, "教师");
        t.action();
        t.showInfo();

        Student s = new Student("李四", 28, 2);
        s.action();
        s.showInfo();
    }
}
