package com.inkwhite.test5;

//定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//学生的属性：学号，姓名，年龄。
//要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//要求2：添加完毕之后，遍历所有学生信息。
//要求3：通过id删除学生信息
//如果存在，则删除，如果不存在，则提示删除失败。
//要求4：删除完毕之后，遍历所有学生信息。
//要求5：查询数组id为"heima002”的学生，如果存在，则将他的年龄+1岁
public class Student {
    private int stu_id;      // 学号
    private String stu_name;    // 姓名
    private int stu_age;        // 年龄

    public Student() {
    }

    public Student(int stu_id, String stu_name, int stu_age) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_age = stu_age;
    }

    /**
     * 获取
     *
     * @return stu_id
     */
    public int getStu_id() {
        return stu_id;
    }

    /**
     * 设置
     *
     * @param stu_id
     */
    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    /**
     * 获取
     *
     * @return stu_name
     */
    public String getStu_name() {
        return stu_name;
    }

    /**
     * 设置
     *
     * @param stu_name
     */
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    /**
     * 获取
     *
     * @return stu_age
     */
    public int getStu_age() {
        return stu_age;
    }

    /**
     * 设置
     *
     * @param stu_age
     */
    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public void showInfo() {
        System.out.println("----------------");
        System.out.println("学生ID为 : " + this.getStu_id() +
                "\n学生姓名为 : " + this.getStu_name() +
                "\n学生年龄为 :" + this.getStu_age());
        System.out.println("----------------");
    }
}
