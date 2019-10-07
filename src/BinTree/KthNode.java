package BinTree;

import java.util.Stack;

public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        Stack<TreeNode> stack = new Stack<TreeNode> ();
        while (pRoot!=null || !stack.isEmpty()){
            while (pRoot!=null){
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            TreeNode node = stack.pop();
            k--;
            if (k==0)
                return node;
            pRoot = pRoot.right;
        }
        return null;
    }
}
