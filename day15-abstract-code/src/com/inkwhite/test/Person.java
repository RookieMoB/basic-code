package com.inkwhite.test;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 16:29
 * @Version: v1.0.0
 * @Description: 我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
 * 为了出国交流，跟乒乓球相关的人员都需要学习英语。
 * 请用所有知识分析，在这个案例中，哪些是具体类，哪些是抽象类，哪些是接口？
 * 乒乓球运动员 TableTennisPlayer：姓名，年龄，  学打乒乓球，说英语
 * 篮球运动员 BasketballPlayer：   姓名，年龄，  学打篮球
 * 乒乓球教练 TableTennisCoach：   姓名，年龄，  教打乒乓球，说英语
 * 篮球教练 BasketballCoach：      姓名，年龄，   教打篮球
 **/
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(Person p) {
        String skill = "";
        if (p instanceof BasketballCoach bc) { // 蓝球教练
            skill = bc.work();
        } else if (p instanceof BasketballPlayer bp) { // 蓝球运动员
            skill = bp.work();
        } else if (p instanceof TableTennisCoach tc) { // 乒乓球教练
            skill = tc.work();
            skill += " 并且他会 " + tc.speakEnglish();
        } else if (p instanceof TableTennisPlayer tp) {    //乒乓球运动员
            skill = tp.work();
            skill += " 并且他会 " + tp.speakEnglish();
        } else {
            System.out.println("不存在该类型，转换失败");
        }

        System.out.println(getAge() + " 岁的 " + getName() + " 正在 " + skill);
    }

    public abstract String work();

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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
