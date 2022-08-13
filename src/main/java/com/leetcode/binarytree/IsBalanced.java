package com.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    //BFS遍历左右子树深度
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>(), tmp;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            //每遍历一层，计数器+1
            //res++;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
