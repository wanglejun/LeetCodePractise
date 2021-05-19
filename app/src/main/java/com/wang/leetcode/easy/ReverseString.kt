package com.wang.leetcode.easy

/**
 * @Description:反转字符串
 * @Author: wanglejun
 * @CreateDate： 5/19/21 10:07 PM
 *
 */
class ReverseString {
    //个人题解
    fun reverseString(s: CharArray) {
        var index = 0
        for (i in s.indices) {
            var isBreak = false
            isBreak = if (s.size % 2 == 0) {
                index == (s.size - 1) / 2 + 1
            } else {
                index == (s.size - 1) / 2
            }
            if (isBreak) {
                break
            }
            val temp = s[i]
            index++
            s[i] = s[s.size - index]
            s[s.size - index] = temp
        }
    }

    //官方题解 双指针 数组元素前后交换位置
    fun reverseStringLeetCode(s: CharArray){
        val n: Int = s.size
        var right = 0
        var left = n - 1
        while (right<left){
            val temp = s[right]
            s[right] = s[left]
            s[left] = temp
            right++
            left--
        }
    }
}