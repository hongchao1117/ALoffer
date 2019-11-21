package BinTree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 按“之”字型打印二叉树
 */
public class Print02 {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        int layer = 1;
        //s1 ：奇数层
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        //s2：偶数层
        Stack<TreeNode> s2 = new Stack<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        while (!s1.isEmpty() || !s2.isEmpty()){
            if (layer%2!=0){
                ArrayList<Integer> list = new ArrayList<>();
                while (!s1.isEmpty()){
                    TreeNode node = s1.pop();
                    if (node!=null){
                        list.add(node.val);
                        System.out.println(node.val+" ");
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!list.isEmpty()){
                    res.add(list);
                    layer++;
                    System.out.println();
                }
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                while (!s2.isEmpty()){
                    TreeNode node = s2.pop();
                    if (node!=null){
                        list.add(node.val);
                        System.out.println(node.val+" ");
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!list.isEmpty()){
                    res.add(list);
                    layer++;
                    System.out.println();
                }

            }
        }
        return res;


    }
}
