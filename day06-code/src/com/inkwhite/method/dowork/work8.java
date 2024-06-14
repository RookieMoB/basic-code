package com.inkwhite.method.dowork;

//需求：
//定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
//功能：
//将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
public class work8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("原始数组");
        printArr(arr);
        int[] arr1 = fill(arr, 2, 5, 100);
        System.out.println("修改之后的数组");
        printArr(arr1);
    }

    public static int[] fill(int[] arr, int fromIndex, int toIndex, int value) {
        for (int i = fromIndex; i < toIndex; i++) {
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
