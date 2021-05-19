package com.wang.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2数之和
 * Created by wanglejun on 19-5-29.
 */
public class TwoSumSolution {
    //暴力解法 循环遍历
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("i====" + i + "====j====" + j);
                    return new int[]{i, j};
                }
            }
        }


        return null;
    }

    //hash 表
    public int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result) && map.get(result) != i) {
                System.out.println("i====" + i + "====j====" + map.get(result));
                return new int[]{i, map.get(result)};
            }
        }
        return null;
    }

    //官方题解
    public int[] twoSunmLeetCode(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = {3, 4, 2};
        char temps[] = new char[3];
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] indexs= twoSumSolution.twoSunmLeetCode(nums,6);
        for (int i = 0; i < indexs.length; i++) {
            System.out.println("int[]"+indexs[i]);
        }
    }
}
