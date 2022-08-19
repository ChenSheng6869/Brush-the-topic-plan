package com.leetcode.array;

public class Search {

    //在二位数组中查找一个数，如果target>[i][j]往下，否则往左
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //确定二维数组的大小
        int rows = matrix.length, cols = matrix[0].length;
        //从二维数组的右上角开始寻找
        int r = 0, c = cols - 1;
        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        //跳出While循环为止没有与目标值相同的点
        return false;
    }
}
