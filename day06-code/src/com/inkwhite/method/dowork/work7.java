package com.inkwhite.method.dowork;

//需求：
//定义一个方法fill(int[] arr,int value)
//功能：
//将数组arr中的所有元素的值改为value
public class work7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("原始数组 :");
        printArr(arr);
        int[] arr1 = fill(arr, 100);
        System.out.print("修改之后原始数组 :");
        printArr(arr);
        System.out.print("新数组 :");
        printArr(arr1);
    }


    public static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        System.out.print("\n[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
