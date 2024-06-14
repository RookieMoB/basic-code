package com.inkwhite.method.dowork;

//需求：
//定义一个方法copyOfRange(int[] arr,int from, int to)
//功能：
//将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
//并将新数组返回。
public class work10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] new_arr = copyOfRange(arr, 2, 5);
        printArr(new_arr);
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] new_arr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            new_arr[index] = arr[i];
            index++;
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
