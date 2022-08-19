package com.leetcode.linkedlist;

public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        //头节点即为要删除的节点
        if (head.val == val) {
            return head.next;
        }
        //定义前驱,后驱节点
        ListNode pre = head, cur = head.next;
        //1.定位节点
        while (cur != null && cur.val != val) {
            //继续遍历链表
            pre = cur;
            cur = cur.next;
        }
        //2.删除引用,cur即当前节点
        if (cur != null) {
            pre.next = cur.next;
        }
        //返回链表
        return head;
    }
}
