package com.wang.leetcode.easy

import java.lang.StringBuilder
import java.util.*

/**
 * @Description: 翻转单词顺序
 * @Author: wanglejun
 * @CreateDate： 5/19/21 11:18 PM
 *
 */
class ReverseWords {
    companion object {
        fun reverseWords(s: String): String {
            val sArrsy = s.trim().split(" ")
            val tempStr = StringBuilder()
            var index = sArrsy.size - 1
            //从后向前拷贝元素到tempStr
            for (i in sArrsy.indices){
                if (index<0){
                    break
                }
                if(sArrsy[index].isEmpty()){
                    index --
                    continue
                }
                //从后向前拷贝
                tempStr.append(sArrsy[index])
                if (i<sArrsy.size-1){
                    tempStr.append(" ")
                }
                index --
            }
            return tempStr.toString()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            System.out.println("reverseWords====${reverseWords("  hello world!  " )}===")
        }
    }

}