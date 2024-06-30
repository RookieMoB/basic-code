package com.inkwhite.studentsystem;
//	属性：id、姓名、年龄、家庭住址
public class Student {
    private String stu_id;
    private String stu_name;
    private int stu_age;
    private String stu_address;

    public Student() {
    }

    public Student(String stu_id, String stu_name, int stu_age, String stu_address) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_address = stu_address;
    }

    /**
     * 获取
     * @return stu_id
     */
    public String getStu_id() {
        return stu_id;
    }

    /**
     * 设置
     * @param stu_id
     */
    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    /**
     * 获取
     * @return stu_name
     */
    public String getStu_name() {
        return stu_name;
    }

    /**
     * 设置
     * @param stu_name
     */
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    /**
     * 获取
     * @return stu_age
     */
    public int getStu_age() {
        return stu_age;
    }

    /**
     * 设置
     * @param stu_age
     */
    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    /**
     * 获取
     * @return stu_address
     */
    public String getStu_address() {
        return stu_address;
    }

    /**
     * 设置
     * @param stu_address
     */
    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    public String toString() {
        return "Student{stu_id = " + stu_id + ", stu_name = " + stu_name + ", stu_age = " + stu_age + ", stu_address = " + stu_address + "}";
    }

    public void showInfo() {
        System.out.println(getStu_id() + "\t" + getStu_name() + "\t" + getStu_age() + "\t\t" + getStu_address());
    }
}
