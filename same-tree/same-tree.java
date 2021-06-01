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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode curr1=p;
        TreeNode curr2=q;
    
        if(p==null && q == null)
            return true;
        if(p==null)
            return false;
        if(q==null)
            return false;
        
        if(curr1.val != curr2.val)
            return false;
        
        
       return  isSameTree(curr1.left,curr2.left) && isSameTree(curr1.right,curr2.right);
        
            
            
    }
}