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
    public int pathSum(TreeNode root, int targetSum) {
        int count = 0;
        if(root == null)
            return 0;
        return path(root,targetSum,0) + pathSum(root.left,targetSum)+ pathSum(root.right,targetSum);
    }
    public int path(TreeNode root, int targetsum, long sum){
        int count =0;
        if(root == null){
            return count;
        }
        sum = sum + root.val;
        if(sum == targetsum){
            count++;
        }
            count= count+ path(root.left,targetsum,sum);
            count = count+path(root.right,targetsum,sum);
        sum = sum -root.val;
        return count;
    }
    }
