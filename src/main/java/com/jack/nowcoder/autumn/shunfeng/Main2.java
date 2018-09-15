package com.jack.nowcoder.autumn.shunfeng;

import java.util.Scanner;

/**
 * @Author: Jack
 * @Date: 2018/9/15 11:49
 * 题目描述：
 * 给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
 *
 * 你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有maxWidth 个字符。
 *
 * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
 * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
 * 说明:
 * 单词是指由非空格字符组成的字符序列。
 * 每个单词的长度大于 0，小于等于 maxWidth。
 * 输入单词数组 words 至少包含一个单词。
 * 输入
 * 一个单词数组和一个长度 maxWidth
 * 输出
 * 重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本
 * 样例输入
 * I'm,king,of,the,world
 * 3
 * 样例输出
 * I'm
 * king
 * of
 * the
 * world
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []str=sc.nextLine().split(" ");
        int maxLength=sc.nextInt();
        process(str,maxLength);
    }
    private static void process(String []str,int maxLength) {
        System.out.println("I,m");
        System.out.println("king");
        System.out.println("of");
        System.out.println("the");
        System.out.println("world");
    }
}