package com.inkwhite.dowork;
//请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
public class work2Teacher {
    private String name;
    private String professional_name;

    public work2Teacher() {
    }

    public work2Teacher(String name, String professional_name) {
        this.name = name;
        this.professional_name = professional_name;
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
     * @return professional_name
     */
    public String getProfessional_name() {
        return professional_name;
    }

    /**
     * 设置
     * @param professional_name
     */
    public void setProfessional_name(String professional_name) {
        this.professional_name = professional_name;
    }

    public String toString() {
        return "work2Teacher{name = " + name + ", professional_name = " + professional_name + "}";
    }

    public void showInfo() {
        System.out.println("姓名 : " + getName() + " 专业 : " + getProfessional_name());
    }
}
