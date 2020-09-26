package BinTree;

public class kthLargest {
    private int res,count;
    public int kthLargest(TreeNode root, int k) {
        methodHelper(root,k);
        return res;
    }

    private void methodHelper(TreeNode root, int k) {
        if (root==null) return;
        methodHelper(root.right,k);
        if (++count==k)
            res = root.val;
        methodHelper(root.left,k);
    }
}
