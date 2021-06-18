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
    int max = 0;
    
    public int inO(TreeNode root)
    {
       if(root == null)
           return 0;
        int left = Math.max(0,inO(root.left));
        int right = Math.max(0,inO(root.right));
        max = Math.max(max,left+right+root.val);
        return Math.max(left,right) + root.val;
        
            
    }
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        inO(root);
        return max;
    }
}