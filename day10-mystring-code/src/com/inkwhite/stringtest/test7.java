package com.inkwhite.stringtest;

// 关键词替换
public class test7 {
    public static void main(String[] args) {
        String talk = "hello，你TMD, 真CNM";
        String[] arr = {"TMD", "CNM", "MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
