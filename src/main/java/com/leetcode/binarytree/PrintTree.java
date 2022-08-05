package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    public int[] levelOrder(TreeNode root){
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        queue.offer(root);
        while (!queue.isEmpty()){
            //返回第一个元素并从队列中删除
            TreeNode node = queue.poll();
            ans.add(node.val);
            //将左右子节点放入队列中
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
