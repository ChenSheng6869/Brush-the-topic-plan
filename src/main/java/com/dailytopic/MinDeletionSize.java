package com.dailytopic;

public class MinDeletionSize {
    public int minDeletionSize(String[] strs){
        int row = strs.length;
        int col = strs[0].length();
        int count = 0;
        //i：行
        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (strs[j-1].charAt(i) > strs[j].charAt(i)){
                    count++;
                    //跳回第一层循环，比较下一列
                    break;
                }
            }
        }
        return count;
    }
}
