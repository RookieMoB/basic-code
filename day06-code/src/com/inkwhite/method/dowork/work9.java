package com.inkwhite.method.dowork;

//需求：
//定义一个方法copyOf(int[] arr, int newLength)
//功能：
//将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
public class work9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] new_arr = copyOf(arr, 6);
        printArr(new_arr);
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] new_arr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
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
