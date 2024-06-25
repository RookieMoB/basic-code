package com.inkwhite.dohomework;
//我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
// 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
// 规则为：
// 号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
public class work5 {
    public static void main(String[] args) {
        String str_id1 = "";
        String str_id2 = "00000000000000000x";
        String str_id3 = "80000000000000x00x";
        String str_id4 = "80000000000000000x";
        System.out.println(checkoutID(str_id1) ? "合法" : "不合法");
        System.out.println(checkoutID(str_id2) ? "合法" : "不合法");
        System.out.println(checkoutID(str_id3) ? "合法" : "不合法");
        System.out.println(checkoutID(str_id4) ? "合法" : "不合法");
    }

    public static boolean checkoutID(String str_id) {   // 检验身份证号是否合法
        if (str_id.length() != 18) {    //号码为18位
            return false;
        }

        if (str_id.charAt(0) == '0') {  //不能以数字0开头
            return false;
        }

        char[] id_char_array = str_id.toCharArray();
        for (int i = 0; i < id_char_array.length - 1; i++) {    //前17位只可以是数字
            if (id_char_array[i] >= '0' && id_char_array[i] <= '9') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
