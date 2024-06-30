package com.inkwhite.demo3;

public class Manager extends Employee {
    private String manage_bonus;

    public Manager() {
    }

    public Manager(int id, String name, String wages, String manage_bonus) {
        super(id, name, wages);
        this.manage_bonus = manage_bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    /**
     * 获取
     * @return manage_bonus
     */
    public String getManage_bonus() {
        return manage_bonus;
    }

    /**
     * 设置
     * @param manage_bonus
     */
    public void setManage_bonus(String manage_bonus) {
        this.manage_bonus = manage_bonus;
    }

    public String toString() {
        return "Manager{manage_bonus = " + manage_bonus + "}";
    }
}
