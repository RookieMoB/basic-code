package com.inkwhite.test4;
//定义数组存储3部手机对象。
//手机的属性：品牌，价格，颜色。
//要求，计算出三部手机的平均价格
public class Phone {
    private String brand;       // 品牌
    private int price;          // 价格
    private String color;       // 颜色


    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
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
        return "Phone{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
