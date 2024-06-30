package com.inkwhite.staticdemo1;

//需求：在实际开发中，经常会遇到一些数组使用的工具类。
//请按照如下要求编写一个数组的工具类：ArrayUtil
//●提供一个工具类方法printArr,用于返回整数数组的内容。
//返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组)
//●提供这样一个工具方法getAerage,用于返回平均分。（只考虑浮点型数组，且只考虑一维数组)
//●定义一个测试类TestDemo,调用该工具类的工具方法，并返回结果。
public class UtilsTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String printed = Utils.printArr(arr1);
        System.out.println(printed);

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        double aerage = Utils.getAerage(arr2);
        System.out.println(aerage);
    }
}
