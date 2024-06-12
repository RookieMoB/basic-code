package com.inkwhite.dowork.loop;

/*
 * 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
 * 假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/

public class work3 {
    public static void main(String[] args) {
        double mountain_height = 8844430.0;
        double paper_height = 0.1;
        int count = 0;
        while (paper_height < mountain_height) {
            paper_height += paper_height;
            // 或者可以写⬇️
//            paper_height *= 2;
            count++;
        }
        System.out.println("一共要折叠 " + count + " 次");
    }
}
