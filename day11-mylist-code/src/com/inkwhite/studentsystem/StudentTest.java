package com.inkwhite.studentsystem;
//#### 添加功能：
//​	键盘录入每一个学生信息并添加，需要满足以下要求：
//* id唯一

//#### 删除功能：
//​	键盘录入要删除的学生id，需要满足以下要求：
//* id存在删除
//* id不存在，需要提示不存在，并回到初始菜单

//#### 修改功能：
//​	键盘录入要修改的学生id，需要满足以下要求
//* id存在，继续录入其他信息
//* id不存在，需要提示不存在，并回到初始菜单

//#### 查询功能：
//​	打印所有的学生信息，需要满足以下要求
//* 如果没有学生信息，提示：当前无学生信息，请添加后再查询
//* 如果有学生信息，需要按照以下格式输出。
//id			姓名		年龄		家庭住址
//heima001	张三		23		 南京
//heima002	李四		24		 北京
//heima003	王五		25		 广州
//heima004	赵六	 	26		 深圳

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    private static final int ADD_STUDENT = 1;
    private static final int DEL_STUDENT = 2;
    private static final int MODIFY_STUDENT = 3;
    private static final int QUERY_STUDENT = 4;
    private static final int EXIT = 5;

    public static void main(String[] args) {
        mainFunction();
    }

    public static void mainFunction() {
        ArrayList<Student> stus = new ArrayList<>();

        Student stu1 = new Student("1", "张三", 18, "河北");
        Student stu2 = new Student("2", "李四", 28, "山东");
        Student stu3 = new Student("3", "王五", 38, "北京");
        Student stu4 = new Student("4", "赵六", 48, "天津");

        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);

        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            showMenu();
            System.out.println("请输入您的选择 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_STUDENT -> {
                    String result = isAdd(stus) ? "添加成功" : "添加失败";
                    System.out.println(result);
                    if (result.equals("添加成功")) {
                        printStudentInfo(stus, stus.size() - 1);
                    }
                    System.out.println("请输入任意键继续");
                    sc.next();
                }
                case DEL_STUDENT -> {
                    System.out.println("删除学生");
                    System.out.println("请输入想要进行删除的学生🆔");
                    String id = sc.next();
                    isDel(stus, id);
                    System.out.println("请输入任意键继续");
                    sc.next();
                }
                case MODIFY_STUDENT -> {
                    System.out.println("修改学生");
                    System.out.println("请输入想要进行修改的学生🆔");
                    String id = sc.next();
                    isModify(stus, id);
                    System.out.println("请输入任意键继续");
                    sc.next();
                }
                case QUERY_STUDENT -> {
                    System.out.println("查询学生");
                    showQuery(stus);
                    System.out.println("请输入任意键继续");
                    sc.next();
                }
                case EXIT -> {
                    System.out.println("退出");
                    isContinue = false;
                }
                default -> System.out.println("其他情况");
            }
        }
    }

    public static void showQuery(ArrayList<Student> stus) { // 查询学生
        if (stus.isEmpty()) {
            System.out.println("当前暂无学生信息，请添加后进行查询");
            return;
        }

        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (Student student : stus) {
            student.showInfo();
        }
    }

    public static boolean isModify(ArrayList<Student> stus, String id) {  // 修改学生
        boolean isExist = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getStu_id().equals(id)) {
                isExist = true;
                System.out.println("请输入学生的新🆔");
                String new_id = sc.next();
                System.out.println("请输入学生的新名字");
                String new_name = sc.next();
                System.out.println("请输入学生的新年龄");
                int new_age = sc.nextInt();
                System.out.println("请输入学生的新地址");
                String new_address = sc.next();

                stus.get(i).setStu_id(new_id);
                stus.get(i).setStu_name(new_name);
                stus.get(i).setStu_age(new_age);
                stus.get(i).setStu_address(new_address);
            }
        }

        if (!isExist) {
            System.out.println("该学生🆔不存在，请添加后进行修改");
            return false;
        } else {
            System.out.println("修改成功");
            return true;
        }
    }

    public static void isDel(ArrayList<Student> stus, String id) { // 删除学生
        boolean isExist = false;
        int index = 0;
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getStu_id().equals(id)) {
                isExist = true;
                index = i;
            }
        }

        if (isExist) {  // 存在
            stus.remove(index);
            System.out.println("删除成功");
            System.out.println("删除之后，学生的全部信息为 :");
            printStudentInfo(stus);
        } else {    // 不存在
            System.out.println("该学生🆔不存在");
            mainFunction();
        }
    }

    public static boolean isAdd(ArrayList<Student> stus) {  // 添加学生
        Scanner sc = new Scanner(System.in);
        String id = "";
        boolean isExist = false;
        while (!isExist) {
            System.out.println("请输入学生的 id :");
            id = sc.next();
            for (int i = 0; i < stus.size(); i++) {
                if (stus.get(i).getStu_id().equals(id)) {
                    System.out.println("该学生 id 已存在哦，请重新录入 :");
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                break;
            }
        }

        System.out.println("请输入学生的 姓名 :");
        String name = sc.next();
        System.out.println("请输入学生的 年龄 :");
        int age = sc.nextInt();
        System.out.println("请输入学生的 家庭住址 :");
        String address = sc.next();

        Student stu = new Student(id, name, age, address);
        if (stus.add(stu)) {
            return true;
        } else {
            return false;
        }
    }

    public static void showMenu() {
        System.out.println("-------------欢迎来到黑马学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
    }

    public static void printStudentInfo(ArrayList<Student> stus) {
        for (int i = 0; i < stus.size(); i++) {
            stus.get(i).showInfo();
        }
    }

    public static void printStudentInfo(ArrayList<Student> stus, int index) {
        stus.get(index).showInfo();
    }
}
