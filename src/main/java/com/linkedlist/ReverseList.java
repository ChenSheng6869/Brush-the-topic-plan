package com.linkedlist;


import com.leetcode.linkedlist.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        return recur(head, null);
    }

    private ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        //遍历直至末尾
        ListNode res = recur(cur.next, cur);
        cur.next = pre;
        return res;
    }
}





