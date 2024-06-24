package com.inkwhite.dowork;
// 定义一个女朋友类。
// 女朋友的属性包含：姓名，身高，体重。
// 行为包含：洗衣服wash()，做饭cook()。
// 另外定义一个用于展示三个属性值的show()方法。
// 请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。
// 打印效果如下：
// 我女朋友叫凤刘诗诗,身高168.0厘米,体重100.0斤
// 女朋友帮我洗衣服
// 女朋友给我做饭
public class work2 {
    private String name;
    private double height;
    private double weight;

    public work2() {
    }

    public work2(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void wash() {
        System.out.println("洗衣服 loading……");
    }
    public void cook() {
        System.out.println("做饭 loading……");
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("我的女朋友 " + name + " 身高 " + height + " 体重 " + weight);
    }
}
