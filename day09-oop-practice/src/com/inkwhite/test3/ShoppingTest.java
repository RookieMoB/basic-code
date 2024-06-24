package com.inkwhite.test3;

//创建三个商品对象，并把商品对象存入到数组当中
public class ShoppingTest {
    public static void main(String[] args) {
        Shopping shopping1 = new Shopping("a01", "华为P40", 5999.99, 100);
        Shopping shopping2 = new Shopping("b01", "OPPOrevo12", 6999.99, 60);
        Shopping shopping3 = new Shopping("c01", "IQOO12", 8999.99, 10);
        Shopping[] shoppings = {shopping1, shopping2, shopping3};

        for (int i = 0; i < shoppings.length; i++) {
            System.out.println(shoppings[i].toString());
        }
    }
}
