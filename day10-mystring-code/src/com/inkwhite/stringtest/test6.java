package com.inkwhite.stringtest;
// 根据省份证信息获取出生年月日以及性别
public class test6 {
    public static void main(String[] args) {
        String id_num = "000000200107260010";
        String year = id_num.substring(6, 10);
        String month = id_num.substring(10, 12);
        String day = id_num.substring(12, 14);
        char gender = id_num.charAt(16);
        int gender_num = gender - 48;   // 利用 ASCII 表将 字符 转换为 数字
        System.out.println(gender_num);

        System.out.println("人物信息为 :");
        System.out.println("出生年月日 : " + year + " 年 " + month + " 月 " + day + " 日");
        System.out.println("性别为 : " + (gender_num % 2 == 0 ? "女" : "男"));
    }

}
