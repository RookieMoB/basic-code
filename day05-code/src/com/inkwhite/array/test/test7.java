package com.inkwhite.array.test;

import java.util.Random;

//打乱数组中的数据
//需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序

// 需要注意的是，打乱顺序要使用到的是交换 而非重新赋值！！！
public class test7 {
    public static void main(String[] args) {
        Random r = new Random();
        int index = 0;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("交换前数组中的元素为 :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            index = r.nextInt(arr.length);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        System.out.println("交换后数组中的元素为 :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
