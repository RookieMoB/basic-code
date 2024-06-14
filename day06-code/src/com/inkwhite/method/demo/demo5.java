package com.inkwhite.method.demo;

/*
 * 有返回值类型的方法
 */
public class demo5 {
    public static void main(String[] args) {
        double one = currMonth(10, 20, 30);
        double two = currMonth(40, 50, 60);
        double three = currMonth(70, 80, 90);
        double four = currMonth(100, 110, 120);
        double total = one + two + three + four;
        System.out.println("第一季度 : " + one);
        System.out.println("第二季度 : " + two);
        System.out.println("第三季度 : " + three);
        System.out.println("第四季度 : " + four);
        System.out.println(" 总 季度 : " + total);
    }

    public static double currMonth(double first, double second, double third) {
        //需求：定义一个方法，求一家商场每个季度的营业额
        //根据方法结果再计算出全年营业额。
        return first + second + third;
    }
}
