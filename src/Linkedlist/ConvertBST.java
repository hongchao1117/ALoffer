package Linkedlist;

import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class ConvertBST {
    public TreeNode Convert(TreeNode root) {
       if (root.left==null&&root.right==null || root==null)
           return root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        TreeNode pre = null;//前一个结点
        boolean isFirst = true;//是不是第一个结点
        while (!stack.isEmpty() || temp!=null){
            while (temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            if (isFirst){
                root = temp;
                pre = root;
                isFirst = false;
            }else{
                pre.right = temp;
                temp.left = pre;
                pre = temp;
            }
            temp = temp.right;
        }
        return root;
    }

}
