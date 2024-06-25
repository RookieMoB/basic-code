package com.inkwhite.dowork;
//给定两个字符串，A和B。
//A的旋转操作就是将A最左边的字符移动到最右边。
//例如，若A='abcde',在移动一次之后结果就是'bcdea'。
//如果在若干次调整操作之后，A能变成B,那么返回True。
//如果不能匹配成功，则返回false
public class work01 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "deabc2";

        boolean isMapping = false;

        String new_A = elementExchange(A);
        int count = 1;
        while (!new_A.equals(A)) {
            new_A = elementExchange(new_A);
            if (new_A.equals(B)) {
                isMapping = true;
                break;
            }
            count++;
        }

        System.out.println("字符串 " + A + " 与字符串 " + B + " 第 " + count + " 次反转" + (isMapping ? " 是匹配的" : " 都是不匹配的"));
    }

    public static String elementExchange(String str) { // 对传入进来的字符串进行一次反转
        // 其实也可以不创建字符数组，因为str本身有个属性就是str.toCharArray()，返回值为 char[]
        char[] c = new char[str.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }

        for (int i = 1; i < c.length; i++) {
            char temp = c[i - 1];
            c[i - 1] = c[i];
            c[i] = temp;
            // 也可以这样写
            // 开始遍历前，将第一个值存放到某个变量里面
            // c[i - 1] = c[i];
            // 然后遍历完成之后将保存的第一个值放到最后
        }

        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }

        System.out.println();
        for (char c1 : c) {
            System.out.print(c1);
        }
        System.out.println();

        return sb.toString();
//        // 或者可以截取字符串之后再拼接
//        // 获取最左侧那个字符
//        char first = str.charAt(0);
//        // 获取剩余的字符
//        String end = str.substring(1);
//        // 返回即可
//        return first + end;
    }
}
