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
    int sum = 0;
    public void recur(TreeNode root)
    {
        if(root==null)
            return;
        recur(root.right);
        sum = sum + root.val;
        root.val = sum;
        recur(root.left);
        
    }
    public TreeNode convertBST(TreeNode root) {
        recur(root);
        return root;
    }
}