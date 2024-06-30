package com.inkwhite.ArrayListTest;
//需求：
//定义Javabean类：Phone
//Phone属性：品牌，价格。
//main方法中定义一个集合，存入三个手机对象。
//分别为：小米，1000。苹果，8000。锤子2999。
//定义一个方法，将价格低于3000的手机信息返回。
public class test6Phone {
    private String brand;
    private int price;


    public test6Phone() {
    }

    public test6Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
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
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "test6Phone{brand = " + brand + ", price = " + price + "}";
    }
}
