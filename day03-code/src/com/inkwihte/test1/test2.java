package com.inkwihte.test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
           * 您和您的约会对象在餐厅里面正在约会。
           * 键盘录入两个整数，表示您和你约会对象的衣服的时髦度。（手动录入0 - 10之间的整数，不能录入其他）
           * 如果你的世贸成都大于你对象的世贸成都，相亲就成功，输出true，否则输出false
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的时髦度");
        int men = sc.nextInt();
        System.out.println("请输入您对象时髦度");
        int wem = sc.nextInt();
        System.out.println(men > wem);
    }
}
