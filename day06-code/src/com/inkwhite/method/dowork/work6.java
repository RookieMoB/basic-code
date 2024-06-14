package com.inkwhite.method.dowork;
//需求：
//定义一个方法equals(int[] arr1,int[] arr2).
//功能：
//比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
public class work6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println("这两个数组 : " + (isEquals(arr1, arr2) ? "相等" : "不相等"));
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {1,2,3,4,5};
        System.out.println("这两个数组 : " + (isEquals(arr3, arr4) ? "相等" : "不相等"));
    }

    public static boolean isEquals(int[] arr1,int[] arr2) {
        if (arr1.length == arr2.length) {   // 先判断长度是否想等
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
