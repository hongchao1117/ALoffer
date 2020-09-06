package BinTree;

import java.util.ArrayList;
import java.util.List;

public class levelOrder {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
       methodHelper(root,0);
       return res;
    }

    private void methodHelper(TreeNode root, int k) {
        if (root!=null){
            if (res.size()<=k) res.add(new ArrayList<>());
            res.get(k).add(root.val);
            methodHelper(root.left,k+1);
            methodHelper(root.right,k+1);
        }

    }
}
