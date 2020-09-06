package Linkedlist;

import javax.swing.*;

public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null) return head;
        ListNode pre = null;
        ListNode cur = head;
        if (head.val==val) return head.next;
        while (cur.val!=val){
            pre.next = cur;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
