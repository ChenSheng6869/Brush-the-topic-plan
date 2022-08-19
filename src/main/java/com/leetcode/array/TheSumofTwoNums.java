package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        hashtable.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            //如果存在target-nums[i]的数，返回下表i，将数组的值作为key，存储，下标作为value存储
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            //put(key,value)
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}

public class TheSumofTwoNums {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {1, 1, 2, 3, 4};
        int target = 7;
        System.out.println(Arrays.toString(s1.twoSum(nums, target)));

    }
}
