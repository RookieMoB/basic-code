package com.inkwihte.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，将其拆分为各位、十位、百位后，打印在控制台
        Scanner m_in = new Scanner(System.in);
        int num = m_in.nextInt();
        int Individual_position = num % 10;
        int ten = (num / 10) % 10;
        int Hundred_places = (num / 100) % 10;

        System.out.println("输入的数字为 : " + num);

//        System.out.println("百位为 : " + Hundred_places);
//        System.out.println("十位为 : " + ten);
//        System.out.println("个位为 : " + Individual_position);

        // 切换为 字符串拼接的方式进行输出
        System.out.println("百位为 : " + Hundred_places + "十位为 : " + ten + "个位为 : " + Individual_position);
    }
}
