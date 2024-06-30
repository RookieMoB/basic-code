package com.inkwhite.dowork2;
//完成代码(按照标准格式写)，然后在测试类中测试。
//1.手机类Phone
// 属性:品牌brand,价格price
// 无参构造,有参构造
// 行为:打电话call,发短信sendMessage,玩游戏playGame
//2.测试类
// 创建Phone类对象,调用Phone类中的方法
public class work2 {
    public static void main(String[] args) {
        Phone xiaomi = new Phone("xiaomi", 1999.99);
        xiaomi.size = 6;
        xiaomi.call();
        xiaomi.sendMessage();
        xiaomi.playGame();
        xiaomi.showInfo();

        Phone huawei = new Phone("huawei", 9999.99);
        huawei.call();
        huawei.sendMessage();
        huawei.playGame();
        xiaomi.showInfo();
    }
}
