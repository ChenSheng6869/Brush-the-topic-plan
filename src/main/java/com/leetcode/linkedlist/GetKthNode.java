package com.leetcode.linkedlist;

public class GetKthNode {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //初始化节点,former,latter都指向头节点head
        //让former与latter之间相隔k步,former往后走,直至相隔k步.
        //当former为空时,former到链表尾部,与latter之间相隔k哥节点,latter节点即为所需要找的节点.
        ListNode former = head,latter = head;
        //former先走K步
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
