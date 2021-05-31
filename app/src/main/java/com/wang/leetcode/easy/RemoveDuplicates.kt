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
            var size = nums.size
            if (size == 0){
                return 0
            }
            var slow = 1
            var fast = 1
            while (fast<size){
                if (nums[fast - 1] != nums[fast]){
                    nums[slow] = nums[fast]
                    slow++
                }
                fast++
            }
            return slow
        }

        @JvmStatic
        fun main(args: Array<String>) {
            System.out.println("replaceSpace====${removeDuplicates(intArrayOf(1,1,2))}")
        }
    }

}