package com.leetcode.binarytree;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TreeToDoublyList {
    //相邻节点的引用关系
    //pre：前驱节点  cur：当前节点
    //pre.right = cur;  cur.left = pre;
    //循环链表
    //头节点：head  尾节点：tail
    //head.left = tail; tail.right = head;
    Node pre, head;

    //二叉搜索树构建链表
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    //打印中序遍历
    public void dfs(Node cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);
        if (pre != null) {
            pre.right = cur;
        } else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
