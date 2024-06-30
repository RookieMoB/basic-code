package com.inkwhite.staticdemo1;

//需求：在实际开发中，经常会遇到一些数组使用的工具类。
//请按照如下要求编写一个数组的工具类：ArrayUtil
//●提供一个工具类方法printArr,用于返回整数数组的内容。
//返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组)
//●提供这样一个工具方法getAerage,用于返回平均分。（只考虑浮点型数组，且只考虑一维数组)
//●定义一个测试类TestDemo,调用该工具类的工具方法，并返回结果。
public class Utils {
    // 将构造函数设置为私有，确保外界创建不了该类的对象
    private Utils() {
    }

    // 返回数组的内容
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    // 返回平均值
    public static double getAerage(double[] arr) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;

        return avg;
    }
}
