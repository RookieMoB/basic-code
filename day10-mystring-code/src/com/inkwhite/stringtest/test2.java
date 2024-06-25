package com.inkwhite.stringtest;
// 字符串拼接
//定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
//调用该方法，并在控制台输出结果。
//例如：
//数组为int[] arr = {1,2,3};
//执行方法后的输出结果为：[1,2,3]
public class test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String print = print(arr);
        System.out.println(print);
    }

    public static String print(int[] arr) {
        String result = "[";
        System.out.println("拼接的新数组为 :");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i] + "]";
            } else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }
}
