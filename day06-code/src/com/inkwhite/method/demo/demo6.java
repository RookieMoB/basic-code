package com.inkwhite.method.demo;
//定义方法，比较两个长方形的面积。
public class demo6 {
    public static void main(String[] args) {
        System.out.println(compare(rectangleArea(1, 2), rectangleArea(3, 4)));
    }

    public static int rectangleArea(int len, int width) {   // 求长方形面积
        return len * width;
    }

    public static String compare(int area1, int area2) {
        return area1 > area2 ? "第一个长方形面积大" : "第二个长方形面积大";

    }
}
