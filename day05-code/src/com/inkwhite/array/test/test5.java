package com.inkwhite.array.test;

import java.util.Random;

//需求：生成10个1~100之间的随机数存入数组。
//1)求出所有数据的和
//2)求所有数据的平均数
//3)统计有多少个数据比平均值小
public class test5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        int sum = 0;
        int average = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((100 + 1) -1) + 1;
        }
        System.out.println("数组元素为 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i : arr) { // 求和
            sum += i;
        }
        average = sum / arr.length; // 平均数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println("所有数据的 和 为 : " + sum);
        System.out.println("所有数据的 平均值 为 : " + average);
        System.out.println("所有数据中 小于平均值的个数 为 : " + count);
    }
}
