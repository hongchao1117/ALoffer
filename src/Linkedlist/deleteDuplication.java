package Linkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class deleteDuplication {


    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null ||pHead.next==null)
            return pHead;
        ListNode current;
        if (pHead.val==pHead.next.val){
            current = pHead.next.next;
            while (current!=null && current.val==pHead.val){
                current = current.next;
            }
            return deleteDuplication(current);
        }else{
            current = pHead.next;
            pHead.next = deleteDuplication(current);
            return pHead;
        }

    }
}
