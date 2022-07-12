package com.tree;

/**
 * @description: TODO
 * @className: PublicAncestor
 * @author: Chenhf
 * @date: 2022/7/11 10:13
 * @version: 1.0
 */
public class PublicAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) return null;
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
