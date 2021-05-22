package com.wang.leetcode.easy

/**
 * @Description:验证回文串
 * @Author: wanglejun
 * @CreateDate： 5/20/21 11:13 PM
 *
 */
class IsPalindrome {
    fun isPalindrome(s: String): Boolean {
        val str = StringBuffer()
        //取出字符串中的字符和数字
        for (i in 0 until s.length) {
            if (Character.isLetterOrDigit(s[i])) {
                str.append(s[i])
            }
        }
        //左右双指针对比
        val length = str.length
        var left = 0
        var right = length - 1
        for (i in 0 until length) {
            if (Character.toLowerCase(str[left]) != Character.toLowerCase(str[right])) {
                return false
            }
            if (left > right) {
                return true
            }
            left++
            right--
        }
        return true
    }
}