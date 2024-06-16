package com.inkwhite.test;

// 投注号码由6个红色球号码和1个蓝色球号码组成。
// 红色球号码从1一33中选择
// 蓝色球号码从1一16中选择。

/*
 * 总结：
 * 1、使用随机数生成获奖号码，存放在win_num数组中
 * 2、用户键盘录入号码存放在user_num数组中
 * 3、统计中奖号码个数，在统计的函数中使用包含函数，传入数组及对应数字
 * 4、最后依次进行判断*/

// 逻辑修改
// 1、之前的红色号码球中，是可以重复的，但是实际上却不能重复，进行修改，在生成中奖号码中判断一下生成的数字在数组内是否包含即可
// 2、在用户输入的时候进行判断是否满足条件
//      红色球号码从1一33中选择
//      蓝色球号码从1一16中选择。

import java.util.Random;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        // 获取中奖号码
        int[] win_num = intermediateNumber();

        // 创建用户输入的号码数组，进行比较
        int[] user_num = new int[win_num.length];
        userInput(user_num);

        System.out.print("你输入的号码为 :");
        printArr(user_num);

        int red_win_count = howManyPrizes(win_num, user_num);   // 判断红球的中奖个数
        int blue_win_count = isContain(win_num, win_num[win_num.length - 1]) ? 1 : 0;
        isSucceed(red_win_count, blue_win_count);
    }

    public static void isSucceed(int red_win_count, int blue_win_count) {       // 判断中的是几等奖
        if (red_win_count == 6 && blue_win_count == 1) {    //一等奖
            System.out.println("恭喜你，荣获一等奖，最高 1000 万");
        } else if (red_win_count == 6 && blue_win_count == 0) {  // 二等奖
            System.out.println("恭喜你，荣获二等奖，最高 500 万");
        } else if ((red_win_count == 5 && blue_win_count == 1) || (red_win_count == 5 && blue_win_count == 0)) { // 三等奖
            System.out.println("恭喜你，荣获三等奖，最高 3000 元");
        } else if ((red_win_count == 4 && blue_win_count == 1) || (red_win_count == 4 && blue_win_count == 0)) {  // 四等奖
            System.out.println("恭喜你，荣获四等奖，最高 200 元");
        } else if ((red_win_count == 3 && blue_win_count == 1) || (red_win_count == 2 && blue_win_count == 1)) {  //五等奖
            System.out.println("恭喜你，荣获五等奖，最高 10 元");
        } else if ((red_win_count == 1 && blue_win_count == 1) || (red_win_count == 0 && blue_win_count == 1)) {  // 六等奖
            System.out.println("恭喜你，荣获六等奖，最高 5 元");
        } else {
            System.out.println("欢迎下次回顾");
        }
    }

    public static void userInput(int[] user_num) {
        // 键盘输入 6 个红球号码 和 1 个蓝球号码进行比较
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.print("初始用户输入数组为 :");
        printArr(user_num);
        System.out.println("--------------------------");
        for (int i = 0; i < user_num.length - 1; ) {
            System.out.println("请输入您的 " + (i + 1) + " 号红色球号码 :");
            int num = sc.nextInt();
            if (num >= 1 && num <= 33 && !isContain(user_num, num)) {     // 在指定范围内，且用户数组内不包含该数字
                user_num[i] = num;
                i++;
            } else {
                System.out.println("号码输入重复，或已超出范围，请重新输入 :");
            }
        }
        System.out.println("请输入您的蓝色球号码 :");
        int num = sc.nextInt();
        if (num >= 1 && num <= 16) {
            user_num[user_num.length - 1] = num;
        }

    }

    public static boolean isContain(int[] arr, int num) {        // 某个数组中是否包含某个数字
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int howManyPrizes(int[] win_arr, int[] user_arr) {   // 判断中的是几等奖
        int count_red = 0;      // 用于记录有几个红球中奖了
//        int count_blue = 0;     // 蓝球
        for (int i = 0; i < user_arr.length; i++) {
            if (i < 6) {    // 先判断红球
                if (isContain(win_arr, user_arr[i])) {
                    count_red++;
                }
            }
//            if (i == 6) {       // 再判断蓝球
//                count_blue++;
//            }
        }
        return count_red;
    }

    public static int[] intermediateNumber() {  // 随机生成中奖号码
        int[] num_arr = new int[7];
        Random r = new Random();
        int rand_red = 0;
        int rand_blue = 0;
        for (int i = 0; i < num_arr.length - 1; ) {
            rand_red = r.nextInt((33 + 1) - 1) + 1;
            if (isContain(num_arr, rand_red)) {     // 判断数组内是否包含刚生成的数字
                // 如果包含的话，啥都不做即可
            } else {    // 不包含的话，添加到数组内
                num_arr[i] = rand_red;
                i++;
            }
        }
        num_arr[6] = r.nextInt((16 + 1) - 1) + 1;
        System.out.print("本期中奖号码为 :");
        printArr(num_arr);
        return num_arr;
    }

    public static void printArr(int[] arr) {
        System.out.print("\n红球 : ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(" 蓝球号码为 : " + arr[i]);
            } else {
                System.out.print(arr[i] + "  ");
            }
        }
        System.out.println();
    }
}
