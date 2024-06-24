package com.inkwhite.test1;

import java.util.Random;

//在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最
//高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
public class test5 {
    public static void main(String[] args) {
        Random r = new Random();
        int score = 0;
        int[] score_arr = new int[6];
        for (int i = 0; i < score_arr.length; i++) {
            score = r.nextInt(101);
            score_arr[i] = score;
        }
        printArr(score_arr);

        int max = getMax(score_arr);
        int min = getMin(score_arr);
        int sum = 0;
        for (int i = 0; i < score_arr.length; i++) {
            sum += score_arr[i];
        }
        sum = sum - max - min;
        int avg = sum / 4;
        System.out.println("去掉最高分 " + max + "、最低分 " + min + " 后的4个评委的平均分为 : " + avg);
    }

    public static int getMax(int[] arr) {       // 获取最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {       // 获取最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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
