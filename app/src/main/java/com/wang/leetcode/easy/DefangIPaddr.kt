package com.wang.leetcode.easy


/**
 * @Description:IP 地址无效化
 * @Author: wanglejun
 * @CreateDate： 5/18/21 11:06 PM
 *
 */
class DefangIPaddr {

    companion object {
        fun defangIPaddr(address: String): String {
            var items = address.toCharArray()
            var tempItems = CharArray(items.size+6)
            var k = 0
            for (i in items.indices){
                if (items[i] == '.'){
                    tempItems.set(k++,'[')
                    tempItems.set(k++,'.')
                    tempItems.set(k++,']')

                }else{
                    tempItems.set(k++,items[i])
                }
            }
            return String(tempItems)
        }

        @JvmStatic
        fun main(args: Array<String>) {
            System.out.println("defangIPaddr====${defangIPaddr("192.168.1.1")}")
        }
    }

}