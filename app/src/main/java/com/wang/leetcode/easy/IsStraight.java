package com.wang.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 扑克牌中的顺子
 * @Author: wanglejun
 * @CreateDate： 6/9/21 11:29 PM
 */
class IsStraight {
    public boolean isStraight(int[] nums) {
        int max = 0,min = 14;
        Set<Integer> repeats = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //跳过大小王
            if (nums[i] == 0){
                continue;
            }
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            //有重复，直接返回
            if (repeats.contains(nums[i])){
                return false;
            }
            repeats.add(nums[i]);
        }
        //max-min < 5 肯定时顺子
        return max-min<5;
    }
}
