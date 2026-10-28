/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        paths(root,list,new StringBuilder());
        return list;
    }
    private void paths(TreeNode root,List<String> list,StringBuilder sb){
        if(root == null){
            return;
        }
        int len = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            list.add(sb.toString());
            sb.setLength(len);
            return;
        }
        sb.append(root.val);
        sb.append("->");
        paths(root.left,list,sb);
        paths(root.right,list,sb);
        sb.setLength(len);
    }
}