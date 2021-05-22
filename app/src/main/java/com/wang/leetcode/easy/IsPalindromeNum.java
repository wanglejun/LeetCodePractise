package com.wang.leetcode.easy;

/**
 * @Description: 回文数
 * @Author: wanglejun
 * @CreateDate： 5/22/21 4:46 PM
 */
class IsPalindromeNum {
    //官方题解思路，反转数字一半和另一半对比
    public boolean isPalindrome(int x) {
        //负数和个位是0的数都不是回文数
        if(x<0||(x!=0&&x%10==0)){
            return false;
        }
        int reverseNum = 0;
        //对数字的一半进行反转
        while (x>reverseNum){
            reverseNum = reverseNum*10 + x%10;
            x = x/10;
        }
        // 偶数位x == reverseNum，奇数位 x ==reverseNum/10
        return x == reverseNum || x ==reverseNum/10;
    }

    //双指针前后相向遍历
    public boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        int length = str.length();
        int left = 0,right = length-1;
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
