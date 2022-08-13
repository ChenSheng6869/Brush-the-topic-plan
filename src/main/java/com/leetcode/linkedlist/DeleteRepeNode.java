package com.leetcode.linkedlist;

import java.util.HashSet;

public class DeleteRepeNode {
    public ListNode deleteRepeNode(ListNode head) {
        ListNode pre = head, cur = head.next;
        //hashset用于保存节点的值
        HashSet<Integer> visited = new HashSet<>();
        while (cur != null) {
            if (visited.contains(cur.val)) {
                pre.next = cur.next;
            } else {
                visited.add(cur.val);
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
