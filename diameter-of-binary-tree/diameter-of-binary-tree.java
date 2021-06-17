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
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        int left =0;
        int right = 0;
        if(root==null)
            return 0;
        if(root.left!=null)
          left =  height(root.left);
        if(root.right!=null)
        right =  height(root.right);
       
        return   Math.max(Math.max(left+right,diameterOfBinaryTree(root.left)),diameterOfBinaryTree(root.right)); 
        
           
       
    }
}