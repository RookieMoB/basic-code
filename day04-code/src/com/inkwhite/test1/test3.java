package com.inkwhite.test1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*
        * 假设某影院售卖了100张票，票的序号为 1~100
        * 其中奇数票号坐左侧，偶数票号坐右侧
        * 键盘哭如一个整数表示电影票的票号
        * 根据不同情况，给出不同的提示：
        * 如果票号为奇数，那么打印坐左边
        * 若果票号为偶数，那么打印左右边*/
        System.out.println("请输入您的票号");
        Scanner sc = new Scanner(System.in);
        int ticket_number = sc.nextInt();
        if (ticket_number < 0 || ticket_number > 100) {
            System.out.println("输入不规范，请重新输入");
        } else if (ticket_number % 2 == 0) {
            System.out.println("请您坐右边");
        } else {
            System.out.println("请您坐左边");
        }
    }
}
