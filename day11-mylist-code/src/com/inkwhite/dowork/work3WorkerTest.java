package com.inkwhite.dowork;

import java.util.ArrayList;

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
public class work3WorkerTest {
    public static void main(String[] args) {
        ArrayList<work3Worker> list = new ArrayList<>();

        work3Worker w1 = new work3Worker("张三", 3000);
        work3Worker w2 = new work3Worker("李四", 3500);
        work3Worker w3 = new work3Worker("王五", 4000);
        work3Worker w4 = new work3Worker("赵六", 4500);
        work3Worker w5 = new work3Worker("田七", 5000);

        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        printInfo(list);

        int index = isExist(list, "王五");

        boolean flag = index == -1 ? false : true;
        if (flag) {
            list.get(index).setName("王小五");
            System.out.println("修改成功");
        } else {
            System.out.println("没找到该同志");
        }

        index = isExist(list, "赵六");
        flag = index == -1 ? false : true;
        if (flag) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("没找到该同志");
        }

        index = isExist(list, "田七");
        flag = index == -1 ? false : true;
        if (flag) {
            list.get(index).setWages(list.get(index).getWages() + 500);
            System.out.println("涨金成功");
        } else {
            System.out.println("没找到该同志");
        }

        printInfo(list);
    }

    public static int isExist(ArrayList<work3Worker> list, String name) {
        if (list.isEmpty()) {
            System.out.println("当前员工数量为 0 ，请添加后进行后续操作");
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public static void printInfo(ArrayList<work3Worker> list) {
        System.out.println("-----------------------------");
        for (work3Worker worker : list) {
            worker.showInfo();
        }
        System.out.println("-----------------------------");
    }
}
