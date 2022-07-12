package com.leetcode.sanliuling;

import java.util.Scanner;

/**
 * 最近，小七发现了一处干涸的河道。
 *
 * 河道不同的位置高度也不相同，从河道起点到终点有n个位置，这些位置编号为1~n。
 * 每一个位置i的高度可以表示为hi(1、n是河道的两端，因此1左边、n右边的高度可以视为无穷大)。
 *
 * 本着环保的精神，小七希望在恰好一个位置注入水源，使得这个位置是有水的。
 * 自然地，水会从高处向低处流动，但原来的位置仍然有水。
 * 具体地来说，如果当前一个位置i是有水的，并且有某一个相邻的格子j高度严格小于i(hj < hi)，那么j也会成为有水的，并且i仍然是有水的。对于j相邻的格子也是如此。
 *
 * 现在小七想知道，通过一次注入水源最多可以使得多少个位置变成有水的
 */
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //1
        int n = in.nextInt();
        in.nextLine();
        //2
        String[] s = in.nextLine().split(" ");
        int[] h = new int[n];


        for(int i = 0; i < n; i++){
            h[i] = Integer.parseInt(s[i]);
        }

        int[] left = new int[n];
        left[0] = 1;

        for(int i = 1; i < n; i++){
            if(h[i] > h[i - 1]){
                left[i] = left[i - 1] + 1;
            }
            else{
                left[i] = 1;
            }
        }

        int[] right = new int[n];
        right[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            if(h[i] > h[i + 1]){
                right[i] = right[i + 1] + 1;
            }
            else{
                right[i] = 1;
            }
        }

        int max = 1;
        for(int i = 0; i < n; i++){
            max = Math.max(max, left[i] + right[i] - 1);
        }
        System.out.println(max);
    }
}
