package BinTree;

public class GetNext {
    public static void main(String[] args) {


    }

    public TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) return null;
        if (node.right != null){//如果有右子树，则找右子树最左的结点
            node = node.right;
            while (node.left!=null)
                node = node.left;
            return node;
        }

        while (node.next != null){//没有右子树，则找第一个当前结点 是父节点左孩子的结点
            if (node.next.left == node)
                return node.next;
            node = node.next;
        }
        return null;//退到 根结点 还没找到，则返回 null
    }

}
