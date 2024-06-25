package com.inkwhite.dohomework;
//生成验证码
//内容：可以是小写字母，也可以是大写字母，还可以是数字
//规则：

import java.util.Random;

//长度为5
//内容中是四位字母，1位数字。
//其中数字只有1位，但是可以出现在任意的位置。
public class work2 {
    public static void main(String[] args) {
        String str_letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str_num = "0123456789";

        char[] str_c = new char[5];
        Random r = new Random();
        int rand_sub_script = r.nextInt(5);   // 生成随机下标索引,为添加数字做准备
        int rand_num = r.nextInt(str_num.length());     // 生成随机数字数组下标索引
        for (int i = 0; i < str_c.length; i++) {
            int rand_letter = r.nextInt(str_letter.length());      // 生成随机字母数组下标索引
            if (i == rand_sub_script) {
                str_c[i] = str_num.charAt(rand_num);
            } else {
                str_c[i] = str_letter.charAt(rand_letter);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_c.length; i++) {
            sb.append(str_c[i]);
        }
        String string = sb.toString();

        System.out.println(string);
    }
}
