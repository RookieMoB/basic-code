package com.inkwhite.method.dowork;
//在主方法中通过键盘录入三个整数。
// 定义一个方法，方法接收三个整数变量，
// 在方法中从大到小依次打印三个变量。执行效果如下：

//请输入第一个整数：10
//请输入第二个整数：30
//请输入第三个整数：20
//从大到小的顺序是： 30 20 10
public class work3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        int num3 = 4;
        int[] arr = coutMax(num1, num2, num3);
        System.out.println("主函数内 :");
        printArr(arr);
    }

    public static int[] coutMax(int num1, int num2, int num3) {
        int[] arr = {num1, num2, num3};
        int temp = 0;
        // 使用冒泡排序进行实现
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        System.out.print("\n[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
