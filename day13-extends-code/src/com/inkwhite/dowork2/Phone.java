package com.inkwhite.dowork2;
/**
 * 完成代码(按照标准格式写)，然后在测试类中测试。
 * 1.手机类Phone
 *  属性:品牌brand,价格price
 *  无参构造,有参构造
 *  行为:打电话call,发短信sendMessage,玩游戏playGame
 * 2.测试类
 *  创建Phone类对象,调用Phone类中的方法
 */
public class Phone {
    public int size;
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call() {
        System.out.println("打电话");
    }
    
    public void sendMessage() {
        System.out.println("发短信");
    }

    public void playGame() {
        System.out.println("打游戏");
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

    public String toString() {
        return "Phone{size = " + size + ", brand = " + brand + ", price = " + price + "}";
    }

    public void showInfo() {
        System.out.println(size + ", " + getBrand() + ", " + getPrice());
    }
}
