package com.inkwhite.dowork;
//定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
//定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭eat()，看家lookHome()
//要求:
//	1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法
//	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
//	3.调用成员方法,打印格式如下:
public class work4Dog {
    private String color;
    private String breed;

    public work4Dog() {
    }

    public work4Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void eat() {
        System.out.println(this.color + "的" + this.breed + "啃骨头……");
    }
    public void lookHome() {
        System.out.println(this.color + "的" + this.breed + "看家……");
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

    /**
     * 获取
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "work4Dog{color = " + color + ", breed = " + breed + "}";
    }
}
