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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>>  a =new ArrayList<List<Integer>> ();
    if (root==null) {return a;}
    
    Queue <TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    
    
    while( !q.isEmpty() )
    {
        int s=q.size();
        List<Integer> x = new ArrayList<Integer>();
        for(int i=0;i<s;i++)
        {
            TreeNode p =q.remove();
            x.add(p.val);
            if( p.left!=null ) {  q.add(p.left); }
            if( p.right!=null ) {  q.add(p.right); }
        }
        
        a.add(x);
            
    }
    
    for (int i=1;i<a.size();i=i+2)
    {        Collections.reverse(a.get(i));        }
    
    return a;
    }
}