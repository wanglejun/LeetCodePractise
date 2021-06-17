package com.wang.leetcode.easy;

import java.util.Arrays;

/**
 * @Description:珠玑妙算
 * @Author: wanglejun
 * @CreateDate： 6/17/21 11:32 PM
 */
class MasterMind {
    public static int[] masterMind(String solution, String guess) {
        int m = solution.length();
        //统计已猜中
        int count = 0;
        //统计solution中已经被使用的元素
        boolean[] used = new boolean[m];
        for (int i = 0; i < m; ++i) {
            if (solution.charAt(i) == guess.charAt(i)){
                count ++;
                used[i] = true;
            }
        }

        int count2 = 0;

        for (int i = 0; i < m; i++) {
            if (solution.charAt(i) == guess.charAt(i)){
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (solution.charAt(j) == guess.charAt(i)&&!used[j]){
                    used[j] = true;
                    count2++;
                    break;
                }
            }
        }
        return new int[]{count,count2};
    }

    public static void main(String[] args) {
        System.out.println("sss"+ Arrays.toString(masterMind("BRBB","RBGY")));
    }
}
