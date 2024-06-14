package com.inkwhite.method.test;


public class test2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99,};
        ergodic(arr);
        int max = getMax(arr);
        System.out.println(max);
        int exits = isExits(arr, 44);
        System.out.println(exits == -1 ? "数组中不存在该元素" : "该数字在数组中的索引为 : " + exits);
        ergodic(newArray(arr, 2, 5));
    }

    // 需求：
    //  定义一个方法copyOfRange(int[] arr,int from,int to)
    // 功能：
    //  将数组arr中从索引from（包含from)开始。
    //  到索引to结束（不包含to)的元素复制到新数组中，
    //  将新数组返回。
                // 需要注意的是⚠️返回回去的数组不能直接使用sout进行输出，而是进行遍历输出，因为返回回去的是数组的首地址
    public static int[] newArray(int[] arr,int from,int to) {
        int[] new_arr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            new_arr[index] = arr[i];
            index++;
        }
        return new_arr;
    }

    // 数组遍历
    //设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]
    public static void ergodic(int[] arr) {
        System.out.print("数组元素为 :\n[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]\n");
    }

    // 数组最大值
    // 设计一个方法求数组的最大值，并将最大值返回
    public static int getMax(int[] arr) {
        System.out.println("数组内元素的最大值为 :");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 判断是否存在
    // 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
    public static int isExits(int[] arr, int num) {
        int index = -1;         // 默认为不存在
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;       // 如果存在，返回对应位置下标
            }
        }
        return index;       // 如果不存在，返回 -1 进行判断
    }
}
