package com.inkwhite.looptest;

/*
* 在实际开发中，如果要获取一个范围中的每一个数据时，会用到循环
* 但是此时，大多数情况下，不会获取所有的数据，而是获取其中符合要求的数据
* 此时就需要循环和其他语句结合使用了*/
public class test3 {
    public static void main(String[] args) {
        // 求 1 ~ 100 之间的偶数和
        int even_number_sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even_number_sum += i;
            }
        }
        System.out.println("偶数和为 : " + even_number_sum);
    }
}
