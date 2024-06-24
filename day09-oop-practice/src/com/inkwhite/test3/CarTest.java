package com.inkwhite.test3;

import java.util.Scanner;

//创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。
public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 定义用于存放三个引用类型的数组
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            // 创建对象，包含属性品牌、价格、颜色
            Car c = new Car();
            System.out.println("请输入第 " + (i + 1) + " 辆汽车的品牌 :");
            String brand2 = sc.next();
            c.setBrand(brand2);
            System.out.println("请输入第 " + (i + 1) + " 汽车的价格 :");
            double price2 = sc.nextDouble();
            c.setPrice(price2);
            System.out.println("请输入第 " + (i + 1) + " 汽车的颜色 :");
            String color2 = sc.next();
            c.setColor(color2);
            cars[i] = c;
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
