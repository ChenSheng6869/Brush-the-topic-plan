package com.leetcode.binarytree;

import java.util.LinkedList;
import java.util.List;

public class PathSum {
    //返回的所有最终路径
    LinkedList<List<Integer>> res = new LinkedList<>();
    //列表path用于保存路径
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    public void recur(TreeNode root, int tar) {
        //空节点，返回
        if (root == null) return;
        //将节点值添加进路径
        path.add(root.val);
        tar -= root.val;
        //tar值为0时,且遍历至叶子节点,将列表path添加进最终列表res
        if (tar == 0 && root.right == null && root.left == null)
            res.add(new LinkedList<>(path));
        recur(root.left, tar);
        recur(root.right, tar);
        //回溯将上一个不符合路径的值移除至列表
        path.removeLast();
    }
}
