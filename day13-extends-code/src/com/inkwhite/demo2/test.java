package com.inkwhite.demo2;

public class test {
    public static void main(String[] args) {
        System.out.println("-------哈士奇-------");
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
        System.out.println("--------沙皮狗------");
        ShariPei sp = new ShariPei();
        sp.eat();
        sp.drink();
        sp.lookHome();
        System.out.println("-------中华田园犬--------");
        ChinesePastoral cp = new ChinesePastoral();
        cp.eat();
        cp.drink();
        cp.lookHome();


    }
}
