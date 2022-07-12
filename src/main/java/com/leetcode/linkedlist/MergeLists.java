package com.leetcode.linkedlist;

public class MergeLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        //新加一条链表temp,定义当前指针cur
        ListNode l3 = new ListNode(0), cur = l3;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        //l1或l2有一条链表为空
        cur.next = l1 == null ? l2 : l1;
        //头节点为空
        //removeRe
        return l3.next;
    }
}
