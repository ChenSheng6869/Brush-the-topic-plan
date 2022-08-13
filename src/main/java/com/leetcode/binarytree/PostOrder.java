package com.leetcode.binarytree;

public class PostOrder {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {
        if (i >= j) return true;
        //遍历左子树，验证左子树序列
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        //遍历右子树，验证右子树序列
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        //左子树在后序遍历序列中的索引：(i, m-1)   j：root
        //右子树在后序遍历序列中的索引：(m, j-1)
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
