package Linkedlist;

/**
 * 输入一个复杂链表
 * （每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，
 * 否则判题程序会直接返回空）
 */
/**具体分为 三步：
 * 1.在旧链表中创建新链表，此时不处理新链表的兄弟结点
 * 2.根据旧链表的兄弟节点，初始化新链表的兄弟节点
 * 3.从旧链表中拆分得到新链表
 */
public class Clone {
    class RandomListNode{
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        public RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode clone(RandomListNode head){
        if (head.next==null && head.random==null || head==null){
            return head;
        }
        /*
         *解题思路：
         *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
         *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
         *3、拆分链表，将链表拆分为原链表和复制后的链表
         */
        RandomListNode temp = head;
        //1.复制每个节点，如复制结点 A 得到 A1,将结点A1查到结点A后面
        while (temp!=null){
            RandomListNode cloneNode = new RandomListNode(temp.label);
            cloneNode.next = temp.next;
            temp.next = cloneNode;
            temp = cloneNode.next;
        }

        temp = head;
        //2.重现遍历链表，复制老结点的随机指针给新的结点，如A1.random = A.random.next;
        while (temp!=null){
            temp.next.random = temp.random==null?null:temp.random.next;
            temp = temp.next.next;
        }

        //3.拆分链表，将链表拆分为原链表和复制后的链表
        temp = head;
        RandomListNode cloneHead = head.next;
        while (temp!=null){
            RandomListNode cloneNode = temp.next;
            temp.next = cloneNode.next;
            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
            temp = temp.next;
        }
        return cloneHead;

    }

}
