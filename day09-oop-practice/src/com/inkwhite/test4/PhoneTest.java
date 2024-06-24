package com.inkwhite.test4;

//定义数组存储3部手机对象。
//手机的属性：品牌，价格，颜色。
//要求，计算出三部手机的平均价格
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米", 2999, "黑色");
        Phone p2 = new Phone("苹果", 8999, "白");
        Phone p3 = new Phone("华为", 4999, "远峰蓝");
        int avg = (p1.getPrice() + p2.getPrice() + p3.getPrice()) / 3;
        System.out.println("三台手机的平均价格为 : " + avg);
    }
}
