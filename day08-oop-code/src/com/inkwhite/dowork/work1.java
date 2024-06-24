package com.inkwhite.dowork;

//定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
//请定义出手机类，类中要有空参、有参构造方法，set/get方法。
//定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
//调用对象的两个功能，打印效果如下：
//正在使用价格为3998元黑色的小米手机打电话....
//正在使用价格为3998元黑色的小米手机发短信....
public class work1 {
    // 成员变量
    private String brand;       // 品牌
    private double price;       // 价格
    private String color;       // 颜色

    // 构造函数
    public work1() {
        System.out.println("--------");
        System.out.println("无参构造|");
        System.out.println("--------");
    }

    public work1(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        System.out.println("--------");
        System.out.println("带参构造|");
        System.out.println("--------");
    }

    // 成员函数
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发消息");
    }


    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "work1{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
