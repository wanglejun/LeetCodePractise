package com.wang.lcpractose;

import java.util.HashMap;

/**
 * Created by wanglejun on 19-5-29.
 */
public class TwoSumSolution {
    //暴力解法 循环遍历
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("i====" + i + "====j====" + j);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

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
}
