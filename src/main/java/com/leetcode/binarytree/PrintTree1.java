package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintTree1 {
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                //返回第一个元素并从队列中删除
                TreeNode node = queue.poll();
                tmp.add(node.val);
                //将左右子节点放入队列中
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            //将tmp列表放入res列表中
            res.add(tmp);
        }
        return res;
    }
}
