package com.inkwhite.dowork;
//定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
//调用对象的两个功能，打印效果如下：
//正在使用价格为3998元黑色的小米手机打电话....
//正在使用价格为3998元黑色的小米手机发短信....
public class work1test {
    public static void main(String[] args) {
        work1 w1 = new work1();
        w1.setBrand("小米");
        w1.setPrice(3998);
        w1.setColor("黑色");
        System.out.print("正在使用价格为" + w1.getPrice() + "元" + w1.getColor() + "的" + w1.getBrand());
        w1.call();
        System.out.print("正在使用价格为" + w1.getPrice() + "元" + w1.getColor() + "的" + w1.getBrand());
        w1.sendMessage();
    }
}
