package com.inkwhite.test;

import java.util.Random;

//定义方法实现随机产生一个5位的验证码
//验证码格式：
//长度为5
//前四位是大写字母或者小写字母
//最后一位是数字
// 大写字母  65 ~ 90
// 小写字母  97 ~ 122
// 生成数字   0 ~  9
public class test3 {
    public static void main(String[] args) {
        func2();
    }

    public static void func2() {    // 第二种写法
        // 可以先把这些数据放到数组当中
        // 在随机抽取一个索引
        // 将🔠和🔡都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {  // 前 26 个存放🔡
                chs[i] = (char) (97 + i);
            } else {        // 后 26 个存放🔠
                chs[i] = (char) (65 + i - 26);      // 因为已经遍历到 26 个了，现在添加要想从 1 开始，必须得减去之前的
            }
        }

        // 随机抽取4次
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
//            System.out.print(chs[index]);
            // 或者可以
            result += chs[index];
        }
        // 随机抽取一个数字 0 ~ 9
        System.out.print(result + r.nextInt(10));

    }

    public static void func1() {    // 第一种写法
        Random r = new Random();
        int big_word1 = r.nextInt((90 + 1) - 65) + 65;
        int big_word2 = r.nextInt((90 + 1) - 65) + 65;
        int small_word1 = r.nextInt((122 + 1) - 97) + 97;
        int small_word2 = r.nextInt((122 + 1) - 97) + 97;
        int num = r.nextInt(10);
        System.out.println((char) big_word1 + "" +
                (char) small_word1 + "" +
                (char) small_word2 + "" +
                (char) big_word2 + "" + num);
    }

}
