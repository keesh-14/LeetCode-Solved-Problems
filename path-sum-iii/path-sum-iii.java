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
    int count = 0;
    public void sum(TreeNode root,int targetSum)
    {
        if(root==null)
            return;
        
        if(targetSum-root.val==0)
        {
            count++;
        }
        sum(root.left,targetSum-root.val);
        sum(root.right,targetSum-root.val);
        
        
    }
    public int pathSum(TreeNode root, int targetSum) {
       if(root==null)
           return count;
        sum(root,targetSum);
        int c  = pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
        return count;
    }
}