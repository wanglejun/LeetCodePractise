package com.wang.leetcode.easy

import java.lang.StringBuilder

/**
 * @Description:替换空格
 * @Author: wanglejun
 * @CreateDate： 5/22/21 4:04 PM
 *
 */
class ReplaceSpace {
    companion object{
        //指针遍历字符串所有字符，如果为空格替换为%20
        fun replaceSpace(s: String): String {
            var items = arrayListOf<String>()
            var index = 0
            val tempStr = StringBuilder()
            while (index<=s.length-1){
                if (s.elementAt(index)!=' '){
                    tempStr.append(s.elementAt(index))
                }else{
                    tempStr.append("%20")
                }
                index++
            }
            return tempStr.toString()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            System.out.println("replaceSpace====${replaceSpace("hello  world ")}")
        }
    }

}