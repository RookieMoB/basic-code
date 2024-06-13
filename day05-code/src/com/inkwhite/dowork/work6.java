package com.inkwhite.dowork;

import java.util.Scanner;

//有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
// 再通过键盘录入一个整数数字。
// 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
// 执行效果如下：
//请输入一个整数数字：
//50
//生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
public class work6 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91, 0};
        System.out.println("请输入一个新的值存放在该数组中 :");
        Scanner sc = new Scanner(System.in);
        int new_num = sc.nextInt(); // 用于存放键盘输入的新值
        arr[arr.length - 1] = new_num;
        int temp = 0;       // 用于存放交换的值的临时位置
        for (int i = arr.length - 1, j = i - 1; j > 0; i--, j--) {
            if (arr[j] > arr[i]) { // 如果前一个比后一个大，进行交换
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
