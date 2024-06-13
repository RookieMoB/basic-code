package com.inkwhite.array.test;

/*
* 需求：已知数组元素为{33,5,22,44,55}
请找出数组中最大值并打印在控制台*/

//3.循环中开始条件一定是0吗？
//循环的开始条件如果为0，那么第一次循环的时候是自己跟自己比了一下，对结果没有任何影响，但是效率偏低
//为了提高效率，减少一次循环的次数，循环开始条件可以写1.
public class test4 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("数组里面的最大值为 : " + max);
        System.out.println("数组里面的最小值为 : " + min);
    }
}
