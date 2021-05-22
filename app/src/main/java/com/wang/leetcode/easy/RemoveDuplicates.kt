package com.wang.leetcode.easy

/**
 * @Description:删除有序数组中的重复项
 * @Author: wanglejun
 * @CreateDate： 5/22/21 11:35 PM
 *
 */
class RemoveDuplicates {

    companion object{
        fun removeDuplicates(nums: IntArray): Int {

            return nums.size
        }

        @JvmStatic
        fun main(args: Array<String>) {
            System.out.println("replaceSpace====${removeDuplicates(intArrayOf(1,1,2))}")
        }
    }

}