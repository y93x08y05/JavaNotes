package com.jack.nowcoder.autumn.toutiao.TOUTIAO20180920;

/**
 * @Author: Jack
 * @Date: 2018/9/20 20:33
 * 题目描述：
 * 数据库里的每条数据可以抽象成一个仅由小写字母构成的字符串
 * 现在想对这些字符串建立前缀标识，产生的标识可以唯一确定一条数据
 * 且产生的前缀标识的总字符数最少。
 * 输入数据确保没有一个字符串是另一个字符串的前缀
 * 例如：对于两个字符串：
 * abcdefg
 * abccefg
 * 我们可以取这样的前缀作为每一个字符串的标识
 * abcd
 * abcc
 * 并可以方便的证明，这种前缀标识的总字符串最少
 * 输入描述：
 * 输入文件的第一行包含一个正整数N，表示字符串的数目。之后N行，
 * 每行一个字符串表示单词
 * 数据范围
 * N<=1000，总字符数<1000000
 * 输出描述：
 * 按照输入文件的顺序输出对应的前缀标识，每个字符串一行。
 * 例1：
 * 输入
 * 5
 * bytedance
 * toutiaohao
 * toutiaoapp
 * iesaweme
 * iestiktok
 * 输出
 * b
 * toutiaoh
 * toutiaoa
 * iesa
 * iest
 */
public class Main2 {
    public static void main(String[] args) {

    }
}