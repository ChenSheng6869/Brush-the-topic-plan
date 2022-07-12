package com.leetcode.binarytree;

import java.util.HashMap;
import java.util.Map;

class RebuildTheBinaryTree {
    int[] preorder;
    //用于标记中序遍历
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        //将中序遍历数组存入map,<key,value>,map.get获取的是value值
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    TreeNode recur(int root, int left, int right){
        //相等就是自己
        if (left > right) return null;
        //1.建立根节点
        TreeNode node = new TreeNode(preorder[root]);
        //2.获取根节点在中序遍历中的索引，划分左右子树(map.get获取的是value值)
        int i = map.get(preorder[root]);
        //3.左子树根节点，左边界，右边界。
        node.left = recur(root+1, left, i-1);
        //4.右子树的根节点，左边界，右边界。(右子树根节点索引 = 根节点+左子树长度+1)
        node.right = recur(i-left+root+1, i+1, right);
        //5.回溯返回根节点
        return node;
    }
}
