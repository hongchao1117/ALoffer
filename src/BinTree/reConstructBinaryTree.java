package BinTree;



public class reConstructBinaryTree {
    public TreeNode reConstructBinTree(int [] pre, int [] in) {
        TreeNode root = reConstructBinTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
        //中序遍历中 值为 pre[0]的左边为左子树，其右边为右子树
    }

    private TreeNode reConstructBinTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre>endPre || startIn>endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]){//中序遍历 中值为 pre[0] 的结点为 root
                root.left = reConstructBinTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right = reConstructBinTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;
    }
}
