package com.binarysearch;

public class MinArrayElement {
    public int minArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            //m向下取余,且m是动态变化的,每次比较将数组比较范围缩小一半
            int m = (i + j) / 2;
            if (nums[m] > nums[j]) i = m + 1;
            else if (nums[m] < nums[j]) j = m;
                //当nums[m] == nums[j]时，一定有区间[i,m]或[m,j]中的元素相等
                //采用线性查找
            else {
                int x = i;
                for (int k = x; k < j; k++) {
                    if (nums[k] < nums[x]) x = k;
                }
                return nums[x];
            }
        }
        return nums[i];
    }
}
