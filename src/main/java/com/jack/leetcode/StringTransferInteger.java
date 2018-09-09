package com.jack.leetcode;

import java.util.Scanner;

/**
 * Created by Jack on 8/14/2018 10:29 PM
 * LeetCode 8
 * 实现 atoi，将字符串转为整数。
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。
 * 如果第一个非空字符是正号或负号，选取该符号，
 * 并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。
 * 如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 字符串可以在形成整数的字符后面包括多余的字符，
 * 这些字符可以被忽略，它们对于函数没有影响。
 * 当字符串中的第一个非空字符序列不是个有效的整数；
 * 或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * 若函数不能执行有效的转换，返回 0。
 * 例1:
 * 输入: "42"
 * 输出: 42
 * 例2:
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 *      我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * 例3:
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * 例4:
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 *      因此无法执行有效的转换。
 * 例5:
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 *      因此返回 INT_MIN (−231) 。
 */
public class StringTransferInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stringToInt(s));
    }
    private static int stringToInt(String s) {
        s=s.trim();
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            if (s.length()==0)
                return 0;
            char c = s.charAt(0);
            if (c!='+'&&c!='-'&&(c-'0'<0||c-'0'>9))
                return 0;
            else {
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                for (int i=1;i<s.length();i++) {
                    char temp = s.charAt(i);
                    if (temp-'0'>=0&&temp-'0'<=9)
                        sb.append(temp);
                    else
                        break;
                }
                if (sb.length()==1) {
                    if (sb.charAt(0)=='+'||sb.charAt(0)=='-')
                        return 0;
                    else
                        return Integer.parseInt(sb.toString());
                } else {
                    if (sb.charAt(0)=='+')
                        s=sb.substring(1,sb.length());
                    else
                        s=sb.toString();
                    try {
                        return Integer.parseInt(s);
                    } catch (Exception e1) {
                        if (s.charAt(0)=='-')
                            return Integer.MIN_VALUE;
                        else
                            return Integer.MAX_VALUE;
                    }
                }
            }
        }
    }
}
