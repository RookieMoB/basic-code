package com.inkwhite.test1;
// 二维数组

// 某商城每个季度的营业额如下：单位（万元）
//      第一季度：22,66,44
//      第二季度：77,33,88
//      第三季度：25,45,65
//      第四季度：11,66,99
//要求计算出每个季度的总营业额和全年的总营业额
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] turnover = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int month_turnover = 0;     // 季度的营业额
        int year_turnover = 0;      // 每年的营业额
        for (int quarter = 0; quarter < turnover.length; quarter++) {       // 每个季度
            for (int month = 0; month < turnover[quarter].length; month++) {    // 每个月份
                month_turnover += turnover[quarter][month];
            }
            System.out.println("第 " + (quarter + 1) + " 个季度的营业额为 : " + month_turnover);
            year_turnover += month_turnover;
            month_turnover = 0;
        }
        System.out.println("每年的营业额为 : " + year_turnover);
    }
}
