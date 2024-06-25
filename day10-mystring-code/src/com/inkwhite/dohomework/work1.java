package com.inkwhite.dohomework;

import java.util.Random;

//键盘输入任意字符串，打乱里面的内容
public class work1 {
    public static void main(String[] args) {
        String str = "abcde";

        String randStr = randStr(str);

        System.out.println(randStr);
    }

    public static String randStr(String str) { // 打乱字符串里面的内容
        Random r = new Random();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int index = r.nextInt(str.length());
            char temp = charArray[i];
            charArray[i] = charArray[index];
            charArray[index] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            sb.append(charArray[i]);
        }

        return sb.toString();
    }
}
