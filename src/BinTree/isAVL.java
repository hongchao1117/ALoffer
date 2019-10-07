package BinTree;

import java.util.ArrayList;

public class isAVL {
    public static void main(String[] args) {
       
    }
    public boolean IsBalanced_Solution(TreeNode root){
        return isAVLHelper(root) != -1;
    }

    private int isAVLHelper(TreeNode root) {
        if (root==null)
            return 0;
        int left = isAVLHelper(root.left);
        if (left==-1)
            return -1;
        int right = isAVLHelper(root.right);
        if (right==-1)
            return -1;
        return Math.abs(left-right)>1?-1:1+Math.max(left,right);
    }

}
