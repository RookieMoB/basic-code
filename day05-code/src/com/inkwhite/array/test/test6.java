package com.inkwhite.array.test;
// 交换数组中的元素
// 需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
// 交换前：1,2,3,4,5
// 交换后：5,2,3,4,1
public class test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("交换前数组中的元素为 :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("交换后数组中的元素为 :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

    }
}
