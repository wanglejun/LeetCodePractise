package com.wang.leetcode.medium;

/**
 * @Description: 零矩阵
 * @Author: wanglejun
 * @CreateDate： 6/15/21 11:59 PM
 */
class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        if (m == 0){
            return;
        }
        int n = matrix[0].length;

        //记录二维数据行是否清零状态
        boolean[] rowState = new boolean[m];
        //记录二维数据列是否清零状态
        boolean[] columnState = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    rowState[i] = true;
                    columnState[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(rowState[i]||columnState[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
