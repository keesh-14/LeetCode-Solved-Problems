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
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> al = new ArrayList<Integer>();
        while(curr!=null || !st.isEmpty())
        {
            while(curr!=null)
            {
                al.add(curr.val);
                st.add(curr);
                curr = curr.left;
            }
            curr = st.pop();
            curr = curr.right;
        }
        return al;
        
    }
}