package com.inkwhite.dowork;
/*给定两个以字符串形式表示的非负整数num1和num2,返回num1和num2的乘积，它们的乘积也表示为字符串形式。
注意：需要用已有的知识完成。*/
public class work04 {
    public static void main(String[] args) {
        String str_num1 = "10";
        String str_num2 = "20";
        char[] strMulResult = getStrMulResult(str_num1, str_num2);
        char[] num_c = new char[strMulResult.length];
        for (int i = 0, j = num_c.length - 1; i < num_c.length; i++, j--) {
            num_c[i] = strMulResult[j];
        }
        // 将字符转换为字符串
        String num_c_to_str = charToString(num_c);

        System.out.println(num_c_to_str);
        System.out.println(num_c_to_str.getClass());
    }

    public static String charToString(char[] c) { // 将字符数组转换为字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        return sb.toString();
    }

    public static char[] getStrMulResult(String str_num1, String str_num2) {   // 获取两个字符串的乘积，最后以字符串的形式进行返回
        // 将字符串转换为数字
        int num1 = strToNum(str_num1);
        int num2 = strToNum(str_num2);
        int result = num1 * num2;

        return numToStr(result);
    }

    public static char[] numToStr(int num) {   // 将数字转换为字符串
        int temp = num;
        // 先获取该数字有几位
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        char[] num_c = new char[count];

        // 将数字依次转换为字符
        int index = 0;
        while (temp != 0) {
            int cur_num = temp % 10;
            num_c[index] = (char) (cur_num + '0');
            temp /= 10;
            index++;
        }

        return num_c;
    }

    public static int strToNum(String str) {    // 将字符串转换为数字
        int num = 0;
        char[] strCharArray = str.toCharArray();

        for (int i = 0; i < strCharArray.length; i++) {
            num = num * 10 + (strCharArray[i] - 48);
        }

        return num;
    }
}
