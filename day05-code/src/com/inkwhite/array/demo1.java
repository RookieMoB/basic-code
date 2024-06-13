package com.inkwhite.array;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 格式：
        // 静态初始化
        // 完整格式：
        // 数据类型 [] 数组名 = new 数据类型 [] {元素1，元素2..·.}；
        // 简化格式：
        // 数据类型 [] 数组名 = {元素1，元素2.·}；
        // 需求1：定义数组存储5个学生的年龄
        int[] age_arr = new int[]{18, 19, 18, 17, 21};
        // 需求2：定义数组存储3个学生的姓名
        String[] name_arr = {"张三", "李四", "王五"};
        // 需求3：定义数组存储4个学生的身高
        double[] height_arr = {11.1, 22.2, 33.3, 44.4};

        System.out.println("学生年龄------");
        for (int i = 0; i < age_arr.length; i++) {
            System.out.println(age_arr[i]);
        }
        System.out.println("学生姓名------");
        for (int i = 0; i < name_arr.length; i++) {
            System.out.println(name_arr[i]);
        }
        System.out.println("学生身高------");
        for (int i = 0; i < height_arr.length; i++) {
            System.out.println(height_arr[i]);
        }
        System.out.println(age_arr);
        System.out.println(name_arr);
        System.out.println(height_arr);
    }
}
