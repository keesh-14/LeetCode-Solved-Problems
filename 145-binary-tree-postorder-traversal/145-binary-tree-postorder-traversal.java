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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<Integer>();
        if(root==null)
            return al;
        Stack<Integer> ans  = new Stack<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;
        st.add(curr);
        while(!st.isEmpty())
        {
            curr = st.pop();
            ans.add(curr.val);
            if(curr.left!=null)
                st.add(curr.left);
            if(curr.right!=null)
                st.add(curr.right);
        }
        while(!ans.isEmpty())
        {
          al.add(ans.pop());   
        }
        return al;
    }
}
