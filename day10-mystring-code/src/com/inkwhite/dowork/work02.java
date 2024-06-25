package com.inkwhite.dowork;

import java.util.Random;

// 键盘输入任意字符串，打乱里面的内容
public class work02 {
    public static void main(String[] args) {
        String str = "abcde";
        char[] new_str = randStr(str);
        for (char c : new_str) {
            System.out.print(c);
        }
    }

    public static char[] randStr(String str) { // 将传入进来的形参进行打乱
        Random r = new Random();
        char[] chars = new char[str.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            int index = r.nextInt(str.length());
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }

        return chars;
    }
}
