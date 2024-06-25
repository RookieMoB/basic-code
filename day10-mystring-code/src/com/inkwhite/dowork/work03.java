package com.inkwhite.dowork;

import java.util.Random;

/*内容：可以是小写字母，也可以是大写字母，还可以是数字
    规则：
    长度为5
    内容中是四位字母，1位数字。
    其中数字只有1位，但是可以出现在任意的位置。*/

// 除以下解题方案之外，还可以按照之前的生成随机验证码的思路来，最后存放到一个字符数组内，然后再打乱顺序即可
public class work03 {
    public static void main(String[] args) {
        String letter = "abcdefghijklmnopqretuvwxyzABCDEFGHIJKLMNOPQRETUVWXYZ";
        char[] num_c = {'1','2','3','4','5','6','7','8','9','0'};

        char[] charArr = toNewCharArr(letter, num_c);

        for (char c : charArr) {
            System.out.print(c);
        }
    }

    public static char[] toNewCharArr(String letter, char[] num_c) {   // 用于产生随机新的字符数组
        char[] letter_c = letter.toCharArray();
        Random r = new Random();
        char[] new_c = new char[5];     // 创建一个新的数组，用于接受拼接之后的新字符串
        int ele_index = r.nextInt(new_c.length);       // 随机一个新数组的下标，用于存放数字
        int num_index = r.nextInt(num_c.length);      // 随机一个数字数组的下标
        for (int i = 0; i < new_c.length; i++) {
            int index = r.nextInt(letter.length());     // 随机一个字母数组的下标
            if (i == ele_index) {       // 该随机下标用于存放数字
                new_c[ele_index] = num_c[num_index];
            } else {
                new_c[i] = letter_c[index];
            }
        }

        return new_c;
    }
}
