package com.leetcode.array;

public class DuplicateNums {

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    //int[] nums = {2,3,1,0,2,5};
    public int duplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                //2 == 1
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                //1,3,2,0,2,5
                swap(nums, nums[i], i);
            }
            //
            swap(nums, nums[i], i);
        }
        return -1;
    }
}
