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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int sum =0;
        preorder(root,ans);
        for(int i =0; i<ans.size(); i++){
            if(ans.get(i) >= low && ans.get(i) <= high){
                sum = sum + ans.get(i);
            }
        }
        return sum;
    }
    public void preorder(TreeNode root, List<Integer> ans){
        if(root != null){
            ans.add(root.val);
            preorder(root.left ,ans);
            preorder(root.right, ans);
        }
        
    }
}