package com.inkwhite.test2;

import java.util.Random;

// 文字版格斗游戏
public class Role {
    private String name;        // 人物
    private int blood;          // 血量
    private char gender;        // 性别
    private String face;        // 长相

    Random r = new Random();

    // 长相
    String[] boy_faces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girl_faces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    // injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        this.setFace(gender);
    }


    public void attack(Role role) {
        // 输出一个攻击效果
        int random_index = r.nextInt(attacks_desc.length);
        String kung_fu = attacks_desc[random_index];
        System.out.printf(kung_fu, this.getName(), role.getName());


        int hurt = r.nextInt(20) + 1;       // 攻击减少的血量
        int temp_blood = role.getBlood() - hurt;
        temp_blood = temp_blood < 0 ? 0 : temp_blood;
        role.setBlood(temp_blood);
        System.out.println("还剩 " + role.getBlood() + " 滴🩸");

        // 受伤的描述
        // 受伤的描述
        // 血量 > 90 0索引的描述
        // 80 ~ 90 1索引的描述
        // 70 ~ 80 2索引的描述
        // 60 ~ 70 3索引的描述
        // 40 ~ 60 4索引的描述
        // 20 ~ 40 5索引的描述
        // 10 ~ 20 6索引的描述
        //  < 10的 7索引的描述
        if (this.getBlood() >= 90) {
            System.out.printf(injureds_desc[0], role.name);
        } else if (this.getBlood() >= 80 && this.getBlood() < 90) {
            System.out.printf(injureds_desc[1], role.name);
        } else if (this.getBlood() >= 70 && this.getBlood() < 80) {
            System.out.printf(injureds_desc[2], role.name);
        } else if (this.getBlood() >= 60 && this.getBlood() < 70) {
            System.out.printf(injureds_desc[3], role.name);
        } else if (this.getBlood() >= 40 && this.getBlood() < 60) {
            System.out.printf(injureds_desc[4], role.name);
        } else if (this.getBlood() >= 20 && this.getBlood() < 40) {
            System.out.printf(injureds_desc[5], role.name);
        } else if (this.getBlood() >= 10 && this.getBlood() < 20) {
            System.out.printf(injureds_desc[6], role.name);
        } else if (this.getBlood() >= 0 && this.getBlood() < 10) {
            System.out.printf(injureds_desc[7], role.name);
        }
    }


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     */
    public void setFace(char gender) {
        if (gender == '男') {
            int random_index = r.nextInt(boy_faces.length);
            this.face = this.boy_faces[random_index];
        } else if (gender == '女') {
            int random_index = r.nextInt(girl_faces.length);
            this.face = this.girl_faces[random_index];
        } else {
            this.face = "相貌简陋";
        }

    }


    public void showRoleInfo() {
        System.out.println("Role\t{name = " + this.getName() +
                "\n\t\tblood = " + this.getBlood() +
                "\n\t\tgender = " + this.getGender() +
                "\n\t\tface = " + this.getFace() + "}");
    }
}
