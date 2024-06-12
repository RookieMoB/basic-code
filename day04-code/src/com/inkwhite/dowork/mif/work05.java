package com.inkwhite.dowork.mif;

import java.util.Scanner;

/*
* 2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
* 也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。如
* 果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
    0 ~ 3000元的部分，交税3%
    3000 ~ 12000元的部分，交税10%
    12000 ~ 25000的部分 ， 交税20%
    25000 ~ 35000的部分，交税25%
    35000 ~ 55000的部分，交税30%
    55000 ~ 80000的部分，交税35%
    超过80000的部分，交税45%
* 比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，
* 个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
* 请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？*/
public class work05 {
    public static void main(String[] args) {
        System.out.println("请输入您的工资 :");
        Scanner sc = new Scanner(System.in);
        double wages = sc.nextDouble();                                 // 工资
        double three_insurances_and_one_gold = wages * 0.1;             // 三险一金
        double flag = wages - three_insurances_and_one_gold - 5000;     // 定义一个标志,用于存放交税的部分
        double price_1 = 0.0, price_2 = 0.0, price_3 = 0.0, price_4 = 0.0;
        double price_5 = 0.0, price_6 = 0.0, price_7 = 0.0;
        if (flag >= 0) {
            if (flag >= 80000) {        // 第七档
                price_7 = (flag - 80000) * 0.45;    // 超过 80000 的部分
                flag = 80000;                    // 未超过 80000 的部分
            }
            if (flag >= 55000) {        // 第六档
                price_6 = (flag - 55000) * 0.35;
                flag = 55000;
            }
            if (flag >= 35000) {        // 第五档
                price_5 = (flag - 35000) * 0.3;
                flag = 35000;
            }
            if (flag >= 25000) {        // 第四档
                price_4 = (flag - 25000) * 0.25;
                flag = 25000;
            }
            if (flag >= 12000) {        // 第三档
                price_3 = (flag - 12000) * 0.2;
                flag = 12000;
            }
            if (flag >= 3000) {        // 第二档
                price_2 = (flag - 3000) * 0.1;
                flag = 3000;
            }
            if (flag >= 0) {        // 第一档
                price_1 = flag * 0.03;
            }
        }

        double taxable_amount = price_1 + price_2 + price_3 + price_4 + price_5 + price_6 + price_7;   // 需要纳税数额
        double after_tax_wages = wages - taxable_amount - three_insurances_and_one_gold;               // 税后工资

        System.out.println("需要纳税数额为 : " + taxable_amount);
        System.out.println("税后工资为 为 : " + after_tax_wages);
    }
}
