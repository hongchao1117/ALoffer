package Linkedlist;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        /*ListNode pre = null;
        ListNode cur = head;
        if (head==null || head.next==null)
            return head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;*/

        //递归
        if (head==null || head.next==null)
            return head;
        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;

    }
}
