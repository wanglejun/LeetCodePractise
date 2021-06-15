package com.wang.leetcode.easy;

import java.util.Arrays;

/**
 * @Description:跳水板
 * @Author: wanglejun
 * @CreateDate： 6/15/21 11:28 PM
 */
class DivingBoard {
    public static int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0){
            return new int[0];
        }
        if(shorter == longer){
            return new int[]{(shorter*k)};
        }
        int n = 0;
        int m = k - n;
        int[] results = new int[k+1];
        while (n<=k){
            int count = m*shorter  + n*longer;
            results[n] = count;
            n++;
            m = k - n;
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divingBoard(1,1,3)));
    }
}
