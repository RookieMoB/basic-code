package com.inkwihte.test1;

public class test4 {
    public static void main(String[] args) {
        /*
         * 动物园里有两只老虎，体重分别为通过键盘录入获得
         * 请用程序实现判断两只老虎的体重是否相同*/
//        Scanner sc = new Scanner(System.in);
//        double weight1 = sc.nextDouble();
//        double weight2 = sc.nextDouble();
//        System.out.println(weight1 == weight2 ? "相同" : "不相同");

        /*
         * 一座寺庙里住着三个和尚，已知他们的身高
         * 分别为150cm、210cm、165cm
         * 请用程序实现获取这三个和尚的最高身高*/
        int monk1 = 150;
        int monk2 = 210;
        int monk3 = 165;
        int max1 = monk1 > monk2 ? monk1 : monk2;
        int max2 = max1 > monk3 ? max1 : monk3;
        System.out.println(max2);
    }
}
