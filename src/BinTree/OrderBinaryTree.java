package BinTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OrderBinaryTree {
    private void preOrder(TreeNode root){
        if (root!=null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //TLR
    private void preOrder01(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
       while (root!=null || !stack.isEmpty()){
            while (root!=null){
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
       }
    }

    //LTR
    private void midOrder01(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(root);
            root = root.right;
        }
        System.out.println();
    }



    private void midOrder(TreeNode root){
       if (root!=null){
           midOrder(root.left);
           System.out.println(root.val);
           midOrder(root.right);
       }
    }

    //层次遍历
    private void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left!=null)
                queue.add(node.left);
            if (node.right!=null)
                queue.add(node.right);
        }
    }


}
