package com.inkwhite.dowork.mif;

import java.util.Scanner;

/*
* 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
        存期		年利率（%）
        一年		2.25
        两年		2.7
        三年		3.25
        五年		3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
提示：
存入金额和存入年限均由键盘录入
本息计算方式：本金+本金×年利率×年限*/
public class work03 {
    public static void main(String[] args) {
        System.out.println("某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：\n" +
                "        存期\t\t年利率（%）\n" +
                "        一年\t\t2.25\n" +
                "        两年\t\t2.7\n" +
                "        三年\t\t3.25\n" +
                "        五年\t\t3.6\n" +
                "请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。\n" +
                "提示：\n" +
                "存入金额和存入年限均由键盘录入\n" +
                "本息计算方式：本金+本金×年利率×年限");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本金 :");
        double capital = sc.nextDouble();           // 键盘输入本金
        System.out.println("请输入年限 :");
        int m_year = sc.nextInt();                  // 键盘输入多少年
        double annual_interest_rate = 0.0;            // 根据输入的年份确定年利率
        switch (m_year) {
            case 1 -> {
                annual_interest_rate = 0.0225 * 1;
                // 出现错误，修改内容为乘以年份
            }
            case 2 -> {
                annual_interest_rate = 0.027 * 2;
                // 出现错误，修改内容为乘以年份
            }
            case 3 -> {
                annual_interest_rate = 0.0325 * 3;
                // 出现错误，修改内容为乘以年份
            }
            case 4 -> {
                annual_interest_rate = 0.036 * 4;
                // 出现错误，修改内容为乘以年份
            }
        }
        double principal_and_interest = capital + (capital * annual_interest_rate * m_year);

        System.out.println("根据您输入的年份和本金,现确认您的本息应为 : " + principal_and_interest + " 元");
    }
}
