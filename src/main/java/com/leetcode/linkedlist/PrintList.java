package com.leetcode.linkedlist;

import java.util.LinkedList;

public class PrintList {
    public int[] reversePrint(ListNode head) {
        //1.将链表节点入栈
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        //2.结点出栈,放入res数组,返回res数组即可
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }
}
