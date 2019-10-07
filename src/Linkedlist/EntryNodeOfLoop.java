package Linkedlist;

import org.w3c.dom.Node;

import java.util.List;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode head) {
        if (head == null || head.next == null)
            return null;

        /**
         * 1.找到环中汇聚点，分别用p1，p2指向链表头部，p1每次走一步，p2每次走两步
         * 直到 p1==p2 找到在环中汇聚点
         * 2.找到环的入口，接上步，当p1==p2时，p2所经过结点数为2x，p1所经过的结点数为x，
         * 设环中有n个结点，p2比p1多走一圈
         */
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                p1 = head;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if (p1 == p2) {
                    return p1;
                }
            }

        }
        return null;
    }
}
