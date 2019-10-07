package Linkedlist;

import java.util.ArrayList;

public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if(pHead1 == null || pHead2 == null)
            return null;
        ListNode temp1 = pHead1,temp2 = pHead2;
        while(temp1.val != temp2.val && temp1!=null && temp2!= null){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1.val == temp2.val){
                return temp1;
            }
        }
        return null;

    }
}
