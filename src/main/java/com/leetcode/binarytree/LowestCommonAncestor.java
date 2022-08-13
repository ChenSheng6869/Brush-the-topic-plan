package com.leetcode.binarytree;

public class LowestCommonAncestor {
    //迭代
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        while (root != null) {
            if (root.val < p.val && root.val < q.val)
                root = root.right;
            else if (root.val > p.val && root.val > q.val)
                root = root.left;
            else break;
        }
        return root;
    }

    //递归
    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //root小于p,q,递归右子树
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        //root大于p,q,递归左子树
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}
