package com.wang.leetcode.easy;

/**
 * @Description:最后一个单词的长度
 * @Author: wanglejun
 * @CreateDate： 5/22/21 4:49 PM
 */
class LengthOfLastWord {
    //尾序遍历
    public int lengthOfLastWord(String s) {
        if(s.equals(" ")){
            return 0;
        }
        int endIndex = s.length()-1;
        int count = 0;
        //处理字符串尾空格
        while (endIndex>=0&&s.charAt(endIndex) == ' '){
            endIndex--;
        }
        //从字符串末尾开始查找知道出现第一个空格
        while (endIndex>=0&&s.charAt(endIndex)!=' '){
            count++;
            endIndex--;
        }
        return count;
    }


    public int lengthOfLastWord1(String s) {
        if(s.equals(" ")){
            return 0;
        }
        String[] item = s.trim().split(" ");
        return item[item.length-1].length();
    }
}
