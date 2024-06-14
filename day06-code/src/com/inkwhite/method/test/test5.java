package com.inkwhite.method.test;
//引用数据类型
//因为传递的是地址而非真实的值，所以两个方法都会指向 new 出来的栈空间，可以做到一改全改
public class test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arr[1]);
        getChange(arr);
        System.out.println(arr[1]);
    }

    public static void getChange(int[] arr) {
        arr[1] = 100;
    }
}
