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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        // al.add(root.val);
        TreeNode curr=root;
        while(curr!=null || s.isEmpty()==false) 
        {
            while(curr!=null)
            {
            al.add(curr.val);
            s.add(curr);
            curr = curr.left;
            }
            curr = s.pop();
            curr = curr.right;
        }
        return al;
        
        
    }
}