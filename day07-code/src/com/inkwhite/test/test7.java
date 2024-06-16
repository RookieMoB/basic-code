package com.inkwhite.test;

import java.util.Random;

//一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，
//打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序
public class test7 {
    public static void main(String[] args) {
        // 定义数组用于存放红包
        int[] red_packet = {2, 588, 888, 1000, 10000};
        // 生成随机数
        Random r = new Random();
        int index = 0;
        int temp = 0;
        for (int i = 0; i < red_packet.length; i++) {
            index = r.nextInt(red_packet.length);
            // 交换数组内元素
            temp = red_packet[i];
            red_packet[i] = red_packet[index];
            red_packet[index] = temp;
        }
        for (int i = 0; i < red_packet.length; i++) {
            System.out.println("现金红包🧧 " + red_packet[i] + " 被抽中");
        }
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
