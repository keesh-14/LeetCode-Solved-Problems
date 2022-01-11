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
    public int sum(TreeNode root,int sum)
    {
       if(root==null)
           return 0;
        int data = (sum*2)+root.val;
        if(root.left==null && root.right==null)
            return data;
        return sum(root.left,data) + sum(root.right,data);
    }
    public int sumRootToLeaf(TreeNode root) 
    {
       return sum(root,0);
    
    }
}