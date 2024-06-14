package com.inkwhite.method.test;
//需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
//要求：兼容全整数类型(byte,short,.int,long)
public class test1 {
    public static void main(String[] args) {
        contrast((byte)10, (byte)20);
        contrast((short)10, (short)20);
        contrast(10, 20);
        contrast((long)10, (long)20);
    }
    public static void contrast(byte b1, byte b2) {
        System.out.println("byte");
        if (b1 > b2) {
            System.out.println(b1 + " > " + b2);
        } else {
            System.out.println(b1 + " < " + b2);
        }
    }
    public static void contrast(short s1, short s2) {
        System.out.println("short");
        if (s1 > s2) {
            System.out.println(s1 + " > " + s2);
        } else {
            System.out.println(s1 + " < " + s2);
        }
    }
    public static void contrast(int i1, int i2) {
        System.out.println("int");
        if (i1 > i2) {
            System.out.println(i1 + " > " + i2);
        } else {
            System.out.println(i1 + " < " + i2);
        }
    }
    public static void contrast(long n1, long n2) {
        System.out.println("long");
        if (n1 > n2) {
            System.out.println(n1 + " > " + n2);
        } else {
            System.out.println(n1 + " < " + n2);
        }
    }
}
