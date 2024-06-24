package com.inkwhite.dowork;
// 请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。
// 打印效果如下：
// 我女朋友叫凤刘诗诗,身高168.0厘米,体重100.0斤
// 女朋友帮我洗衣服
// 女朋友给我做饭
public class work2test {
    public static void main(String[] args) {
        work2 w = new work2();
        w.setName("刘诗诗");
        w.setHeight(168);
        w.setWeight(110);
        w.show();
        w.wash();
        w.cook();
    }
}
