package BinTree;

import java.util.ArrayList;

public class FindPath {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        if(root==null)
            return res;
        list.add(root.val);
        target -= root.val;
        if (target==0 && root.left==null && root.right==null){
            res.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);//深度遍历完进行回退
        return res;
    }
}
