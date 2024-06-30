package com.inkwhite.demo;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 18:15
 * @Version: v1.0.0
 * @Description:
 * 需求：写一个Javabean类描述汽车。
 * 属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
 * 内部类的访问特点：
 * 内部类可以直接访问外部类的成员，包括私有
 * 外部类要访问内部类的成员，必须创建对象
 **/
public class Car {
    private String brand;
    private int age;
    private String color;

    public Car() {
    }

    public Car(String brand, int age, String color) {
        this.brand = brand;
        this.age = age;
        this.color = color;
    }

    public void show() {
        Engine e = new Engine("XXX", 1);
        System.out.println(brand + ", " + age + ", " + color + ", " + e.brand + ", " + e.age);
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
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
        return "Car{brand = " + brand + ", age = " + age + ", color = " + color + "}";
    }

    class Engine {
        private String brand;
        private int age;

        public Engine() {
        }

        public Engine(String brand, int age) {
            this.brand = brand;
            this.age = age;
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
         * @return age
         */
        public int getAge() {
            return age;
        }

        /**
         * 设置
         * @param age
         */
        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return "Engine{brand = " + brand + ", age = " + age + "}";
        }
    }
}
