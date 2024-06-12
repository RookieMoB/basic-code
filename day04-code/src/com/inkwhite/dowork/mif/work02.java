package com.inkwhite.dowork.mif;

import java.util.Scanner;

public class work02 {
    public static void main(String[] args) {
        /*
        * 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
        System.out.println("依次录入三个整数，求出三个数中的最小值");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int min = 0;
//        if (num1 > num2) {
//            min = num2;
//            if (min > num3) {
//                min = num3;
//            }
//        } else {
//            min = num1;
//            if (min > num3) {
//                min = num3;
//            }
//        }
        // 或者可以
        if( num1 < num2 && num1 < num3){
            min = num1;
        }else if( num2 < num1 && num2 < num3){
            min = num2;
        }else{
            min = num3;
        }
        System.out.println("最小值为 : " + min);
    }
}
