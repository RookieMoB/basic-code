package com.inkwhite.demo2;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 8:58
 * @Version: v1.0.0
 * @Description:
 * 4.定义测试类(完成以下打印效果):
 * 		keepPet(Dog dog,String somethind)方法打印内容如下：
 * 			年龄为30岁的老王养了一只黑颜色的2岁的狗
 * 			2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
 * 		keepPet(Cat cat,String somethind)方法打印内容如下：
 * 			年龄为25岁的老李养了一只灰颜色的3岁的猫
 * 			3岁的灰颜色的猫眯着眼睛侧着头吃鱼
 **/
public class Test {
    public static void main(String[] args) {
//        Person p = new Person("老王", 30);
//        Animal a1 = new Dog(2, "黑");
//        p.keepPet(a1, "🦴");
        Person p = new Person("老李", 25);
        Animal a2 = new Cat(3, "灰");
        p.keepPet(a2, "🐟");
    }
}
