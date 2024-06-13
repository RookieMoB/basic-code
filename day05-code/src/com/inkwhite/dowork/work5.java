package com.inkwhite.dowork;
//定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
public class work5 {
    public static void main(String[] args) {
        double average = 0;    // 平均值
        double sum = 0;        // 总分
        double[] arr_score = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        for (int i = 0; i < arr_score.length; i++) {
            sum += arr_score[i];
        }
        average = sum / arr_score.length;
        System.out.println("总分为 : " + sum + " 平均分为 : " + average);
    }
}
