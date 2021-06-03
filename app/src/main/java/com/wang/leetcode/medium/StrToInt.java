package com.wang.leetcode.medium;

/**
 * @Description: 把字符串转换成整数
 * @Author: wanglejun
 * @CreateDate： 5/31/21 11:12 PM
 */
class StrToInt {
    public static int strToInt(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        if (length == 0){
            return 0;
        }
        //遍历开始位置下标
        int index = 0;
        //过滤开头空格字符，获取第一个非空格字符下标位置
        while (chars[index] == ' '){
            index++;
            if (index == length){
                return 0;
            }
        }
        System.out.println("index====="+index);
        //符号位 - 为 -1,+ 为1
        int symbol = 1;
        //确定符号位正负
        if (chars[index] == '-'){
            symbol = -1;
        }
        if (chars[index] == '+'||chars[index] == '-'){
            index++;
        }

        //第一个非空字符不是数字，无需转换
        if (index<length&&(chars[index]<'0'||chars[index]>'9')){
            return 0;
        }

        int result = 0;
        int boundaries = Integer.MAX_VALUE/10;
        while (index<length&&(chars[index]>='0'&& chars[index]<='9')){
            //字符转数字
            int itemTemp = chars[index] - '0';
            System.out.println("itemTemp====="+chars[index]+"=====result=="+result+"==boundaries=="+boundaries);
            //处理越界情况
            if(result > boundaries||(result==boundaries&&itemTemp>7)){
                return symbol>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result = result*10+itemTemp;
            index++;
        }
        return result * symbol;
    }

    public static void main(String[] args) {
        System.out.println("strToInt===="+strToInt("-91283472332"));
    }
}
