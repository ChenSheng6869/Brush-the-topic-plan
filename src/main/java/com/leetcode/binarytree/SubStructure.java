package com.leetcode.binarytree;

public class SubStructure {

    public boolean isSubStructrue(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructrue(A.left, B) || isSubStructrue(A.right, B));
    }

    boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A != null || A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
