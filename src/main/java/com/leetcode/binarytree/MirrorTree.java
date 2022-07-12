package com.leetcode.binarytree;

public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root){
        //1.递归结束条件
        if (root == null) return null;
        //2.递归过程
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}
