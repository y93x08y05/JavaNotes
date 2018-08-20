package com.jack.nowcoder.spring.A163.SpringJob2018;

/**
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，
 * 但是他需要知道自己面向哪个方向，请你帮帮他。
 * 输入描述
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
 * 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
 * 输出描述
 * 输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。
 * 输入例子
 * 3
 * LRR
 * 输出例子
 * E
 */

import java.util.Scanner;

public class Spring_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String str = sc.next();
            int countL = 0;
            int countR = 0;
            for(int i=0;i<num;i++){
                if(str.charAt(i)=='L'){
                    countL++;
                }else{
                    countR++;
                }
            }
            int n = (countL-countR)%4;
            switch (n){
                case 1:
                    System.out.println("W");
                    break;
                case 2:
                    System.out.println("S");
                    break;
                case 3:
                    System.out.println("E");
                    break;
                case 0:
                    System.out.println("N");
                    break;
                case -1:
                    System.out.println("E");
                    break;
                case -2:
                    System.out.println("S");
                    break;
                case -3:
                    System.out.println("W");
                    break;
            }
        }
    }
}