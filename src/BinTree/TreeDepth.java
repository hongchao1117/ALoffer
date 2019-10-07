package BinTree;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0,nextCount = 1,depth = 0;
        while (queue.size()!=0){
            TreeNode temp = queue.poll();
//            System.out.print(temp.val+" ");
            count++;//出列结点数
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
            if (count==nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }

        }
        return depth;

    }
}
