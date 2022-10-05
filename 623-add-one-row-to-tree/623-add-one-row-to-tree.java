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
    public void insert(int val,TreeNode node,int depth,int d){
        if(node == null)
            return;
        if(depth == d-1){
            TreeNode t = node.left;
            node.left = new TreeNode(val);
            node.left.left = t;
            t = node.right;
            node.right = new TreeNode(val);
            node.right.right = t;
        }else
            insert(val,node.left,depth+1,d);
            insert(val,node.right,depth+1,d);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth ==1){
            TreeNode n = new TreeNode(val);
            n.left = root;
            return n;
        }
        insert(val,root,1,depth);
        return root;
    }
}