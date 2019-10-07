package Linkedlist;

//输入两个 单调递增 的链表，输出两个链表合成后的链表，
// 当然我们需要合成后的链表满足  单调不减 规则。
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        ListNode head = null;
        if (list1.val<list2.val){
            head = list1;
            head.next = Merge(list1.next,list2);
        }else{
            head = list2;
            head.next = Merge(list1,list2.next);
        }
        return head;
    }
}
