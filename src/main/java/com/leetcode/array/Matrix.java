package com.leetcode.array;

public class Matrix {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        //矩阵的大小
        int[] res = new int[matrix.length * matrix[0].length];
        //矩阵：d=行，r=列
        int u = 0, d = matrix.length - 1, l = 0, r = matrix[0].length - 1;
        int index = 0;
        while (true){
            //遍历第一行，将元素装入res数组；
            for (int i = l; i <= r; i++) {
                res[index++] = matrix[u][i];
            }
            if (++u > d) break;
            for (int i = u; i <= d ; i++) {
                res[index++] = matrix[i][d];
            }
            if (--r < l) break;
            for (int i = r; i >= l; i--) {
                res[index++] = matrix[d][i];
            }
            if (--d < u) break;

            for (int i = d; i >= u; i--) {
                res[index++] = matrix[i][l];
            }
            if (++l > r) break;
        }
        return res;
    }
}
