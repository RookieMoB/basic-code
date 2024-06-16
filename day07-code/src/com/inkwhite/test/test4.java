package com.inkwhite.test;

/*需求：
把一个数组中的元素复制到另一个新数组中去。*/
public class test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArr(arr);
        int[] new_arr = copyArr(arr);
        printArr(new_arr);
    }

    public static int[] copyArr(int[] arr) {
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
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
