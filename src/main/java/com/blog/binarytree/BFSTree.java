package com.blog.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class BFSTree {
    List<Integer> list = new ArrayList<>();
    public void bfsTree(TreeNode root){
        LinkedList<TreeNode> queue =  new LinkedList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public void dfsTree(TreeNode root){
        if (root == null) return;
        list.add(root.val);
        dfsTree(root.left);
        dfsTree(root.right);
    }
}
