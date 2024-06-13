package com.inkwhite.dowork;

import java.util.Arrays;
import java.util.Random;

//定义一个数组其中包含多个数字。
// 用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
// （可以创建其他数组，不必须在原数组中改变）
public class work7 {
    public static void main(String[] args) {
        // 初始化数组
        Random r = new Random();
        int[] arr = new int[10];
        int[] arr_total = new int[10];  // 定义新数组，用于存放奇数、偶数分割之后的数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        // 检测是否成功初始化
        System.out.println("初始化数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 对奇数、偶数进行分割
        int index_left = 0;     // 左边的下标定义为奇数
        int index_right = arr.length - 1;   // 右边的下标定义为偶数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {  // 奇数
                arr_total[index_left] = arr[i];
                index_left++;
            }
            if (arr[i] % 2 == 0) {  // 偶数
                arr_total[index_right] = arr[i];
                index_right--;
            }
        }

        // 检测是否分割成功
        System.out.println("初始化数组");
        for (int i = 0; i < arr_total.length; i++) {
            System.out.print(arr_total[i] + "\t");
        }
        System.out.println();
    }
}
