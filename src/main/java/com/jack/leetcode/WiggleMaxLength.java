package com.jack.leetcode;

import java.util.Scanner;

/**
 * @Author: Jack
 * @Date: 2018/9/21 11:13
 * LeetCode 376
 * 摆动序列
 * 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为摆动序列。
 * 第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
 * 例如， [1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3) 是正负交替出现的。
 * 相反, [1,4,7,2,5] 和 [1,7,4,5,5] 不是摆动序列，
 * 第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
 * 给定一个整数序列，返回作为摆动序列的最长子序列的长度。 通过从原始序列中删除一些
 * （也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。
 * 例1:
 * 输入: [1,7,4,9,2,5]
 * 输出: 6
 * 解释: 整个序列均为摆动序列。
 * 例2:
 * 输入: [1,17,5,10,13,15,10,5,16,8]
 * 输出: 7
 * 解释: 这个序列包含几个长度为 7 摆动序列，其中一个可为[1,17,10,13,10,16,8]。
 * 例3:
 * 输入: [1,2,3,4,5,6,7,8,9]
 * 输出: 2
 */
public class WiggleMaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(wiggle(arr));
    }
    private static int wiggle(int[] arr) {
        if (arr.length <= 1)
            return arr.length;
        int len = arr.length;
        int flag = -1;
        //flag为0时，差小于0，flag为1时，差大于0，连续数相同时为2
        for (int i = 1; i < arr.length; i++) {
            int dif = arr[i] - arr[i - 1];
            if (i == 1 || flag == 2)
                flag = (dif != 0) ? ((dif > 0) ? 1 : 0) : 2;
            if (flag == 0 && dif < 0)
                flag = 1;
            else if (flag == 1 && dif > 0)
                flag = 0;
            else
                len--;
        }
        return len;
    }
}