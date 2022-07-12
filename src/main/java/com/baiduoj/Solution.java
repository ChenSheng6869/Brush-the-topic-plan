package com.baiduoj;


import java.util.*;

public class Solution {

    public int solve (int n, int[] a1, int[] a2, int[] a3, int[] m) {
        // write code here
        for(int i=1;i<n;i++)
        {
            a1[i]+=Math.max(a1[i-1],a2[i-1]-m[i-1]);//第一行往右一格走
            a2[i]+=Math.max(a2[i-1],Math.max(a1[i-1]-m[i-1],a3[i-1]-m[i-1]));//第二行往右一格走
            a3[i]+=Math.max(a3[i-1],a2[i-1]-m[i-1]);//第三行往右一格走
        }
        return Math.max(a1[n-1],Math.max(a2[n-1],a3[n-1]));
    }
}
