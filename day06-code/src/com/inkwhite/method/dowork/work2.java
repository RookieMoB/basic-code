package com.inkwhite.method.dowork;

//定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class work2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 4;
        System.out.println(num1 + "、" + num2 + "、" + num3 + " 中较大的数据为: " + retMax(num1, num2, num3));
    }

    public static int retMax(int num1, int num2, int num3) {
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // 或者
        // int max = num1 > num2 ? num1 : num2;
        // max = num3 > max ? num3 : max;

        // 再或者，按着黑马的来
//        if (num1 > num2) {
//            //a 大
//            //拿着大的跟第三个数再比较
//            if(num1 > num3){
//                return num1;
//            }else{
//                return num3;
//            }
//        }else{
//            //b 大
//            if(num2 > num3){
//                return num2;
//            }else{
//                return num3;
//            }
//        }
        return max;
    }
}
