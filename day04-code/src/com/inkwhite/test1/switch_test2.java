package com.inkwhite.test1;

import java.util.Scanner;

public class switch_test2 {
    public static void main(String[] args) {
        /*
        * 在实际开发中，如果我们需要在多种情况下选择其中一个，就可以使用switch语句
        * 当我们拨打了某些服务电话时，一般都会有按键选择
        * 电话中语音提示：
        * 1、机票查询
        * 2、机票预订
        * 3、机票改签
        * 4、退出服务
        * 其他按键也是退出服务，请使用switch模该改业务逻辑*/
        System.out.println("请输入您要进行的功能 -------\n" +
                           "        * 1、机票查询\n" +
                           "        * 2、机票预订\n" +
                           "        * 3、机票改签\n" +
                           "        * 4、退出服务");
        Scanner sc = new Scanner(System.in);
        int curr_sel = sc.nextInt();
        switch (curr_sel) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
