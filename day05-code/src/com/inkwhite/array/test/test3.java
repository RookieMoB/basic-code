package com.inkwhite.array.test;
/* 变化数据
* 定义一个数组，存储1,2,3,4,5,6,7,8,9,10
遍历数组得到每一个元素。
要求：
1,如果是奇数，则将当前数字扩大两倍
2,如果是偶数，则将当前数字变成二分之一*/
public class test3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("未修改数组元素之前，数组内的元素为 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {  // 奇数
                arr[i] *= 2;
            } else {    // 偶数
                arr[i] /= 2;
            }
        }
        System.out.println("修改数组元素之后，数组内的元素为 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + "\t");
        }
    }
}
