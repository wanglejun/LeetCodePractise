package com.wang.leetcode.easy

import java.lang.StringBuilder

/**
 * @Description:左旋转字符串
 * @Author: wanglejun
 * @CreateDate： 5/22/21 11:11 PM
 *
 */
class ReverseLeftWords {
    fun reverseLeftWords(s: String, n: Int): String {
        if(n>s.length){
            return ""
        }
        var leftStr = StringBuffer()
        var rigthStr = StringBuffer()
        for (i in 0 until n){
            leftStr.append(s.elementAt(i))
        }

        for (i in n until s.length){
            rigthStr.append(s.elementAt(i))
        }

        return rigthStr.append(leftStr.toString()).toString()
    }
}