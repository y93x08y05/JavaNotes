package com.jack.nowcoder.wangyi.WY20180811;

import java.util.Scanner;

/**
 * Created by Jack on 8/11/2018 9:13 PM
 * 小易觉得高数课很无聊，决定睡觉，不过他对课上的一些内容挺感兴趣的，所以希望你在老师讲到有趣的
 * 部分的时候叫醒他下。你知道了小易对于一堂课每分钟知识点的感兴趣程序，并以分数量化，以及他在这
 * 堂课上每分钟是否会睡着，你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种
 * 方案最大化小易这堂课听的知识点分值。
 * 输入描述：
 * 第一行n表示这堂课持续多少分钟，以及叫醒小易一次使得他能够保持清醒的时间，第二行n个数表示
 * 小易对每分钟知识点的感兴趣评分。第三行n个数表示每分钟小易是否清醒，1表示清醒。
 * 输出描述：
 * 小易这堂课听到的知识点的最大兴趣值
 * 输入例子：
 * 6 3
 * 1 3 5 2 5 4
 * 1 1 0 1 0 0
 * 例子：
 * 16
 */
public class ValueInterestingMax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] score = new int[n];
        int [] warkup = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++) {
            score[i] = sc.nextInt();
            sum+=score[i];
        }
        for (int i=0;i<n;i++) {
            warkup[i] = sc.nextInt();
        }
        if (n<=k)
            System.out.println(sum);
        else {
            sum=0;
            int max=0;
            for (int i=0;i<n;i++) {
                if (warkup[i]==1)
                    sum+=score[i];
                else {
                    int bound = (i+k-1)>=n?n-1:(i+k-1);
                    int window = 0;
                    for (int j=i;j<=bound;j++)
                        if (warkup[i]==0)
                            window+=score[j];
                    if (window>max)
                        max=window;
                }
            }
            System.out.println(max+sum);
        }
    }
}
