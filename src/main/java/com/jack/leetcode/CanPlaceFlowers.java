package com.jack.leetcode;

import java.util.Scanner;

/**
 * @Author: Jack
 * @Date: 2018/10/6 10:40
 * LeetCode 605
 * 种花问题
 * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。
 * 可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。
 * 能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
 * 例1:
 * 输入: flowerbed = [1,0,0,0,1], n = 1
 * 输出: True
 * 例2:
 * 输入: flowerbed = [1,0,0,0,1], n = 2
 * 输出: False
 * 数组内已种好的花不会违反种植规则。
 * 输入的数组长度范围为 [1, 20000]。
 * n 是非负整数，且不会超过输入数组的大小。
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(new CanPlaceFlowers().find(arr, n));
    }
    private boolean find(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == 0) && (i == 0 || arr[i - 1] == 0) && (i == arr.length - 1 || arr[i + 1] == 0)) {
                arr[i] = 1;
                count++;
            }
            if (count >= n)
                return true;
        }
        return false;
    }
}