package com.wang.lcpractose;

/**
 * Created by wanglejun on 19-5-29.
 */
public class TwoSumSolution {
    //暴力解法 循环遍历
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    System.out.println("i===="+i+"====j===="+j);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
