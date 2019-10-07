package BinTree;

public class SerializeBinTree {
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root==null){
             sb.append("# ");
             return sb.toString();
        }
        sb.append(root.val+" ");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    int index = -1;
    TreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        if (index>=len){
            return null;
        }
        String[] strings = str.split(" ");
        TreeNode node = null;
        if (!strings[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strings[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
