package com.inkwhite.ArrayListdemo;

import java.util.ArrayList;

//方法名                           说明
//boolean add(Ee)               添加元素，返回值表示是否添加成功
//boolean remove(Ee)            删除指定元素，返回值表示是否删除成功
//E remove(int index)           删除指定索引的元素，返回被删除元素
//E set(int index,Ee)           修改指定索引下的元素，返回原来的元素
//E get(int index)              获取指定索引的元素
//int size()                    集合的长度，也就是集合中元素的个数
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean add = list.add("ss");
        System.out.println(add);
        boolean remove = list.remove("ss");
        System.out.println(remove);
    }
}
