package com.leetcode.linkedlist;


public class ReverseList {
    //方法1:递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = reverseList(head.next);

        head.next.next = head;

        head.next = null;
        return cur;
    }

    //方法2:迭代
    public ListNode reverseList1(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}





