package BinTree;

public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;//指向父节点的指针

    public TreeLinkNode(int val) {
        this.val = val;
    }
}
