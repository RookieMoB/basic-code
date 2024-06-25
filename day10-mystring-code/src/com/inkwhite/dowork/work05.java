package com.inkwhite.dowork;

/*给你一个字符串s,由若干单词组成，单词前后用一些空格字符隔开。
 返回字符串中最后一个单词的长度。
 单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

 示例1：输入：s = "Hello World"     输出：5
 解释：最后一个单词是Wor1d',长度为5。

 示例2：输入：s = "     fly me to the   moon  "     输出：4
 解释：最后一个单词是moon”,长度为4。

 示例3：输入：s = "luffy is still joyboy"      输出：6
 解释：最后一个单词是长度为6的“joyboy”。*/
public class work05 {
    public static void main(String[] args) {
        String word1 = "Hello World";
        String word2 = "fly me to   the       moon      ";
        String word3 = "luffy   is    still joyboy";

        System.out.println(retLastWordLen(word1));
        System.out.println(retLastWordLen(word2));
        System.out.println(retLastWordLen(word3));
    }

    public static int retLastWordLen(String word) {   // 返回某个句子的末尾单词的长度
        word = word.trim();     // 先去除掉单词前面和后面的空白

        if (word.isEmpty()) {   // 对字符串是否为空进行判断
            return 0;
        }

        int lastSpaceIndex = word.lastIndexOf(' ');// 查找最后一个空格的位置

        if (lastSpaceIndex == -1) {// 如果没有找到空格（即整个字符串就是一个单词），则返回整个字符串的长度
            return word.length();
        }

        return word.length() - lastSpaceIndex - 1;// 返回最后一个单词的长度（最后一个空格之后的所有字符）
    }
}
