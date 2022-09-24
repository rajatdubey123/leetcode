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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allpath = new ArrayList();
        List<Integer> currentpath = new ArrayList<>();
        paths(root,targetSum,currentpath,allpath);
        return allpath;
    }
        public void paths(TreeNode root, int targetsum, List<Integer> currentpath,List<List<Integer>> allpath){
            if(root == null){
                return;
            }
            currentpath.add(root.val);
            if(root.val == targetsum && root.left == null && root.right == null){
                allpath.add(new ArrayList<Integer>(currentpath));
            }else{
                paths(root.left, targetsum - root.val,currentpath,allpath);
                paths(root.right, targetsum - root.val, currentpath,allpath);
            }
            currentpath.remove(currentpath.size() -1);
        }
}