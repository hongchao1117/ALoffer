package BinTree;

import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
@SuppressWarnings("all")
public class Convert {
    public TreeNode Convert(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode pre = null;//用于保存中序遍历序列的上一个结点
        boolean isFirst = true;
        while (p!=null || !stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (isFirst){
                root = p;
                pre = root;
                isFirst = false;
            }else {
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return p;
    }
}
