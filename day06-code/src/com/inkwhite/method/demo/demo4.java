package com.inkwhite.method.demo;

/*
* 无返回值类型的方法
*/
public class demo4 {
    static double pai = 3.14;
    public static void main(String[] args) {
        System.out.println("长方形周长为 :");
        numerationPerimeter(5, 10);
        System.out.println("圆形周长为 :");
        numerationPerimeterCircle(2.2);
    }

    //定义一个方法，求长方形的周长，将结果在方法中进行打印。
    public static void numerationPerimeter(int width, int height) {
        int perimeter = (width + height) * 2;
        System.out.println("该长方形的周长为 : " + perimeter);
    }

    // 定义一个方法，求圆的面积，将结果在方法中进行打印。
    public static void numerationPerimeterCircle(double r) {
        double perimeter = 2 * pai * r;
        System.out.println("该圆的周长为 : " + perimeter);
    }
}
