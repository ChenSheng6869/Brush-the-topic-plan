package com.leetcode.stack;

import java.util.Arrays;
//40.最小的 K 个数✅快排重点🚩
public class MinK {
    //快排+复制数组
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr,0,arr.length-1);
        return Arrays.copyOf(arr,k);
    }

    //快速排序
    //l:0, r:arr.length-1
    private void quickSort(int[] arr, int l, int r) {
        // 子数组长度为 1 时终止递归
        if (l >= r) return;
        // 哨兵划分操作（以 arr[l] 作为基准数）
        int i = l, j = r;
        while (i < j) {
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
            swap(arr, i, j);
        }
        swap(arr, i, l);
        // 递归左（右）子数组执行哨兵划分
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    //交换元素
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
