package BinTree;

import java.util.Stack;
/*
* DFS使用stack来保存成对的节点
* 1.出栈的时候也是成对成对的 ，
1.若都为空，继续；
2.一个为空，返回false;
3.不为空，比较当前值，值不等，返回false；
* 2.确定入栈顺序，每次入栈都是成对成对的，如left.left， right.right ;left.rigth,right.left
*/
public class isSymmetrical {
     boolean isSymmetricalTest(TreeNode root)
    {

        //非递归  用栈的做法 或用 队列 的做法，将 stack 换为 queue即可
        /*if(root==null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()){
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();
            if(left == null && right == null)
                continue;
            if(left==null || right ==null)
                return false;
            if (left.val != right.val){
                return false;
            }
            else {
                stack.push(left.right);
                stack.push(right.left);
                stack.push(left.left);
                stack.push(right.right);
            }
        }
        return true;*/

        //递归的算法
        if(root==null)
            return true;
        return isSymmetricalTest( root.left, root.right);
    }

    private boolean isSymmetricalTest( TreeNode left, TreeNode right){
        if (left == null && right== null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val!=right.val)
            return false;
        return isSymmetricalTest(left.left, right.right) && isSymmetricalTest(left.right, right.left);
    }
}
