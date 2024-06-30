package com.inkwhite.dowork;
//有如下员工信息：
//姓名：张三，工资：3000
//姓名：李四，工资：3500
//姓名：王五，工资：4000
//姓名：赵六，工资：4500
//姓名：田七，工资：5000
//先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
//1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
//2、判断是否有姓名为“赵六”的员工，如果有，将其删除
//3、给姓名为“田七”的员工，涨500工资
public class work3Worker {
    private String name;
    private int wages;

    public work3Worker() {
    }

    public work3Worker(String name, int wages) {
        this.name = name;
        this.wages = wages;
    }


    public void showInfo() {
        System.out.println("姓名 : " + getName() + " 工资 : " + getWages());
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
    public int getWages() {
        return wages;
    }

    /**
     * 设置
     * @param wages
     */
    public void setWages(int wages) {
        this.wages = wages;
    }

    public String toString() {
        return "work3Worker{name = " + name + ", wages = " + wages + "}";
    }
}
