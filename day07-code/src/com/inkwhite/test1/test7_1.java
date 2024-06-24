package com.inkwhite.test1;

import java.util.Random;

// 第二种实现方式：
// 将随机到的数组元素添加到新数组中
// 判断是否存在，如果存在则跳过当前循环，如果不存在，则添加进去
public class test7_1 {
    public static void main(String[] args) {
        int[] red_packet = {2, 588, 888, 1000, 10000};
        int[] new_arr = new int[red_packet.length];
        Random r = new Random();
        int index = 0;
        for (int i = 0; i < red_packet.length; ) {
            index = r.nextInt(red_packet.length);
            if (!contain(new_arr, red_packet[index])) {  // 如果不包含的话，添加进去
                new_arr[i] = red_packet[index];
                i++;
            }
        }
        for (int i = 0; i < new_arr.length; i++) {
            System.out.println("现金红包 " + new_arr[i] + " 被抽中");
        }
    }

    public static boolean contain(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
