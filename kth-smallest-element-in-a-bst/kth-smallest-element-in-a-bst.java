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
    ArrayList<Integer> al  = new ArrayList<Integer>();
    public void inO(TreeNode root)
    {
        if(root==null)
            return;
        inO(root.left);
        al.add(root.val);
        inO(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inO(root);
       
        return al.get(k-1);
    }
}