package com.inkwhite.interface_;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 11:18
 * @Version: v1.0.0
 * @Description:
 * 青蛙frog      属性：名字，年龄   行为：吃虫子，蛙泳
 * 狗dog        属性：名字，年龄   行为：吃骨头，狗刨
 * 兔子rabbit   属性：名字，年龄   行为：吃胡萝卜
 **/
public class test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 2);
        Dog d = new Dog("小黄", 2);
        Rabbit r = new Rabbit("小棉", 2);

        f.eat();
        f.swim();
        d.eat();
        d.swim();
        r.eat();
    }
}
