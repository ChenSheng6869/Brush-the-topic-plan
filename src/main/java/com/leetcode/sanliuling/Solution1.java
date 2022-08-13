package com.leetcode.sanliuling;

import java.util.*;

/**
 * 在某个仓库中，堆积了很多的货物。每个货物是一个正方体的，边长为1。
 * 所有货物恰好堆积成一个长方体，边长为R*C*L。
 * <p>
 * 目前，在某次确认货物的时候，管理员意识到这一堆货物被小偷偷走了一些。
 * 这个小偷将原来的R*C*L的货物组成的长方体偷成了恰好(R-2)*(C-1)*(L-2)的长方体。
 * <p>
 * 但是管理员记不得的R,C,L具体数值了，他只能计算现在的货物总数。
 * 他希望算出来最坏情况下被偷了多少的货物，输出这个最坏的值。
 * n = (R - 2) * (C - 1) * (L - 2)
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(3 * 3 * (n + 1) - n);
    }
}
