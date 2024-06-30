/**
 * @Author: InkWhite
 * @Date: 2024/6/30 8:39
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class test4 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        // a.lookHome();	// 报错
        // a.catchMouse();	// 报错

        /*if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else {
            System.out.println("该类型不存在，无法转换");
        }*/

        // JDK14 之后
        if (a instanceof Dog d) {
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("该类型不存在，无法转换");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("在吃骨头");
    }

    public void lookHome() {
        System.out.println("Dog 特有方法");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("在吃老鼠");
    }

    public void catchMouse() {
        System.out.println("Cat 特有方法");
    }
}
