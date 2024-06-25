package com.inkwhite.dohomework;

import java.util.Objects;

//在String类的API中，有如下两个方法：
//查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
//public int indexOf(String str)
//截取字符串，从索引beginIndex（包含）开始到字符串的结尾
//public String substring(int beginIndex)
//请仔细阅读API中这两个方法的解释，完成如下需求。
//现有如下文本：
// "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。请编写程序，统计该文本中"Java"一词出现的次数。
public class work7 {
    public static void main(String[] args) {
        String text = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String target = text.substring(0, 4);

        int index = 0;      // 定义步长,从哪里开始
        int count = 0;      // 定义计数器

        while ((index = text.indexOf(target, index)) != -1) {   // 如果当前文本查找完毕,结束
            count++;        // 找到了 target 计数器 + 1
            index += target.length();   // 重新规划步长
        }
        System.out.println(count);
    }
}
