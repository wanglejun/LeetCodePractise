package com.wang.leetcode.medium;

/**
 * @Description:一次编辑
 * @Author: wanglejun
 * @CreateDate： 6/17/21 10:44 PM
 */
class OneEditAway {
    public boolean oneEditAway(String first, String second) {
        int m = first.length();
        int n = second.length();
        //长度差超过1肯定无法满足一次编辑
        if (Math.abs(m-n)>1){
            return false;
        }
        //双指针
        int i = 0;
        int j = 0;
        //获取不相等元素下标
        while (i<m&&j<n&&first.charAt(i) == second.charAt(j)){
            i++;
            j++;
        }

        //长度相等
        if(m == n){
            i++;
            j++;
        } else if(m>n){
            i++;
        }else{
            j++;
        }

        //后续元素必须全部相等才能保证一次编辑
        while (i<m&&j<n){
            if(first.charAt(i)!=second.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
