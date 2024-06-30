package com.inkwhite.demo3;

public class Employee {
    private int id;
    private String name;
    private String wages;

    public Employee() {
    }

    public Employee(int id, String name, String wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public void work() {
        System.out.println("员工在工作");
    }
    public void eat() {
        System.out.println("吃米饭");
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return wages
     */
    public String getWages() {
        return wages;
    }

    /**
     * 设置
     * @param wages
     */
    public void setWages(String wages) {
        this.wages = wages;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", wages = " + wages + "}";
    }
}
