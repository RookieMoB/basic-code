package com.inkwhite.test1;

import java.util.Random;

// 文字版格斗游戏
public class Role {
    private String name;        // 人物
    private int blood;          // 血量

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;       // 攻击减少的血量
        int temp_blood = role.getBlood() - hurt;
        temp_blood = temp_blood < 0 ? 0 : temp_blood;
        role.setBlood(temp_blood);
        System.out.println(this.getName() + " 🐓 了 " + role.getName() + " " + hurt + " 滴🩸,还剩 "
                + role.getBlood() + " 滴🩸");
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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }
}
