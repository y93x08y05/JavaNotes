package com.jack.coding;

/**
 * Created by Jack on 7/30/2018 7:48 PM
 * find if have number what we need in a two dimension array
 */
public class Main1 {
    public static int[][] a = {
            {1,2,3,4},
            {2,3,4,5},
            {3,4,5,6},
            {4,5,6,7}
    };
    public static int m = 2;
    public static void main(String[] args) {
        System.out.println(find(a, m));
    }
    public static boolean find(int [][] a,int target) {
        int i=0;
        int len = a.length - 1;
        while ((len >= 0) && (i < a[0].length)) {
            if (a[len][i] > target) {
                len--;
            } else if (a[len][i] < target){
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
